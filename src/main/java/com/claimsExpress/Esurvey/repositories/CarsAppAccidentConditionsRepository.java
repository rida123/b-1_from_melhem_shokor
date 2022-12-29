package com.claimsExpress.Esurvey.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarsAppAccidentConditions;
@EnableJpaRepositories
@Repository
public interface CarsAppAccidentConditionsRepository extends JpaRepository<CarsAppAccidentConditions, String> {
	
	
@Query("select  cc from CarsAppAccidentConditions cc   join fetch  cc.carsAppAccident ca     where ca.accidentId = ?1 ")

Optional <CarsAppAccidentConditions>  findByCarsAppAccident(String accId);
}
