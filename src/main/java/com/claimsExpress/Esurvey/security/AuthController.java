package com.claimsExpress.Esurvey.security;



import com.claimsExpress.Esurvey.models.UserPreference;
import com.fasterxml.jackson.datatype.jsr310.deser.key.OffsetTimeKeyDeserializer;

import com.sun.mail.imap.Rights;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/auth")
public class AuthController {

    @Autowired
    private TokenUtil tokenUtil;
    @Autowired UserRepository userRepository;
    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping(value = {"/login"})
    public ResponseEntity<JwtResponse> signIn(@RequestBody SignInRequest signInRequest) throws Exception {



    	System.out.println("////////////////////////////////////");
System.out.println(signInRequest.getUserId());
System.out.println("////////////////////////////////////");

System.out.println(signInRequest.getPassword());

        final Authentication authentication = authenticate(signInRequest.getUserId(),signInRequest.getPassword());

        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetails userDetails = userService.loadUserByUsername(signInRequest.getUserId());
        String token = tokenUtil.generateToken(userDetails);
                 AppUser user =(AppUser) userDetails;
                List<String> roles =userRepository.findRolesByUser(user.getUsername());
                boolean isTemaUser =false;
        boolean isESurveyUser =false;

                for (String a : roles){
                    if(a.equals("eSurveyAppUser")){
                        isESurveyUser=true;
                    }
                    if(a.equals("temaAppUser")){
                        isTemaUser=true;
                    }

                }
        JwtResponse tokenResponse = new JwtResponse(token,userDetails.getUsername(),isTemaUser,isESurveyUser);

        return  new ResponseEntity(tokenResponse, HttpStatus.OK);
    }


    private String getSHA512SecuredPassword(String passwordToHash) throws Exception {
        String generatedPassword = null;
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        String value = getConfigurationValue("saltSha");
        Assert.hasLength(value);
        md.update(value.getBytes());
        byte[] bytes = md.digest(passwordToHash.getBytes());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        generatedPassword = sb.toString();
        return generatedPassword;
    }
    public String getConfigurationValue(String key) {
        String value = null;
       value= userRepository.findConfigByKey(key);
        return value;
    }


    public Authentication authenticate(String userId,String password) throws Exception {


        AppUser user;
      user=   userRepository.findById(userId).get();
        if (user == null) {
            throw new BadCredentialsException("1000");
        }
        if (!getSHA512SecuredPassword(password).matches(user.getPassword()) ){
            throw new BadCredentialsException("1000");
        }

        return new UsernamePasswordAuthenticationToken(userId, password);
    }


    }







