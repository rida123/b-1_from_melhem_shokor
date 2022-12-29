package com.claimsExpress.Esurvey.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarsAppBodly;
import com.claimsExpress.Esurvey.models.CarsAppDamageParts;

@EnableJpaRepositories
@Repository
public interface CarsAppDamagePartsRepository  extends JpaRepository<CarsAppDamageParts, String>{
	@Query("select  cd from CarsAppDamageParts cd   join fetch  cd.carsAppAccident ca     where ca.accidentId = ?1 ")

List<CarsAppDamageParts>  findByCarsAppAccident(String accidentId);
	
	@Query("select  cd from CarsAppDamageParts cd   join fetch  cd.carsAppAccident ca     where ca.accidentId = ?1  and cd.damagesPartsPartId = ?2 ")
	Optional<CarsAppDamageParts>  findByCarsAppAccidentAndParts(String accidentId, String partCode);

}