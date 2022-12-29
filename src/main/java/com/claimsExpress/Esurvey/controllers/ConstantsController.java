package com.claimsExpress.Esurvey.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.claimsExpress.Esurvey.models.VehicleSize;
import com.claimsExpress.Esurvey.requests.AccidentCoditionsRequest;
import com.claimsExpress.Esurvey.requests.CarsSurveyDamagedPartsListBean;
import com.claimsExpress.Esurvey.responses.BodyTypeListResponse;
import com.claimsExpress.Esurvey.responses.CarBrandListResponse;
import com.claimsExpress.Esurvey.responses.CarTrademarkListResponse;
import com.claimsExpress.Esurvey.responses.CompanyInfoResponse;
import com.claimsExpress.Esurvey.responses.CompanyListResponse;
import com.claimsExpress.Esurvey.responses.DirectionsListResponse;
import com.claimsExpress.Esurvey.responses.DoorsListResponse;
import com.claimsExpress.Esurvey.responses.GenderListResponse;
import com.claimsExpress.Esurvey.responses.InsuranceCompanyListResponse;
import com.claimsExpress.Esurvey.responses.LitigationDamageLovListResponse;
import com.claimsExpress.Esurvey.responses.LitigationDamageLovResponse;
import com.claimsExpress.Esurvey.responses.PartGroupListResponse;
import com.claimsExpress.Esurvey.responses.PolicyTypeListResponse;
import com.claimsExpress.Esurvey.responses.VehicleSizeListResponse;
import com.claimsExpress.Esurvey.services.ConstantService;
@CrossOrigin("*")
@RestController

@RequestMapping(value="/api/v1/constant")
public class ConstantsController   {
	@Autowired 
	private ConstantService constantService ;
@GetMapping("/companiesList")
private ResponseEntity <CompanyListResponse> getCompanies (){
	CompanyListResponse  response= constantService.companyInfoResponseList();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/genderList")
private ResponseEntity <GenderListResponse> getGenders (){
	GenderListResponse  response= constantService.getGendersList();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/carBrandList")
private ResponseEntity <CarBrandListResponse> getCarBrandList (){
	CarBrandListResponse  response= constantService.getCarBrandList();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/carTrademarkList")
private ResponseEntity <CarTrademarkListResponse> getCarTrademarkList (@RequestParam(name="carBrandId") String carBrandId){
	CarTrademarkListResponse  response= constantService.getCarTrademarkList(carBrandId);
	return new ResponseEntity( response ,HttpStatus.OK);
}

@GetMapping("/getDoors")
private ResponseEntity <DoorsListResponse> getDoors (){
	DoorsListResponse  response= constantService.getDoors();
	return new ResponseEntity( response ,HttpStatus.OK);
}

@GetMapping("/getBodyType")
private ResponseEntity <BodyTypeListResponse> getBodyType (){
	BodyTypeListResponse  response= constantService.getBodyType();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/getVehicleSize")
private ResponseEntity <VehicleSizeListResponse> getVehicleSize (){
	VehicleSizeListResponse  response= constantService.getVehicleSize();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/getDescriptions")
private ResponseEntity <LitigationDamageLovResponse> getDescriptions (){
	LitigationDamageLovListResponse  response= constantService.getDescriptions();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/getPartGroup")
private ResponseEntity <PartGroupListResponse> getPartGroup (){
	PartGroupListResponse  response= constantService.getPartGroup();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/getDirections")
private ResponseEntity <DirectionsListResponse> getDirections (){
	DirectionsListResponse  response= constantService.getDirections();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/getPolicyType")
private ResponseEntity <DirectionsListResponse> getPolicyType (){
	PolicyTypeListResponse  response= constantService.getPolicyType();
	return new ResponseEntity( response ,HttpStatus.OK);
}
@GetMapping("/getInsuranceCompany")
private ResponseEntity <DirectionsListResponse> getInsuranceCompany (){
	InsuranceCompanyListResponse  response= constantService.getInsuranceCompany();
	return new ResponseEntity( response ,HttpStatus.OK);
}



}
