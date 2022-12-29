package com.claimsExpress.Esurvey.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarsAppDamageParts;
import com.claimsExpress.Esurvey.models.CarsAppNotes;

@EnableJpaRepositories
@Repository
public interface CarsAppNotesRepository  extends JpaRepository<CarsAppNotes, String>{
	@Query("select  cn from CarsAppNotes cn   join fetch  cn.carsAppAccident ca     where ca.accidentId = ?1 ")
	Optional<CarsAppNotes>  findByCarsAppAccident(String accidentId);

}
