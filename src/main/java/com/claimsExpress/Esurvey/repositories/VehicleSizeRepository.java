package com.claimsExpress.Esurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.VehicleSize;



@Repository
@EnableJpaRepositories
public interface VehicleSizeRepository  extends JpaRepository<VehicleSize, String>{
	

}
