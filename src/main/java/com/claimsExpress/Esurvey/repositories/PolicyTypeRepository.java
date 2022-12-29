package com.claimsExpress.Esurvey.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.claimsExpress.Esurvey.models.CarTrademark;
import com.claimsExpress.Esurvey.models.PolicyType;
import com.claimsExpress.Esurvey.responses.PolicyTypeResponse;


public interface PolicyTypeRepository  extends JpaRepository<PolicyType, String> {
	@Query("select  p from PolicyType p where code in  ('ALL','TPL','MOB')")
	List<PolicyType> getPolicyType();


}
