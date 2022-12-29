package com.claimsExpress.Esurvey.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarsAppAccident;


@Repository
@EnableJpaRepositories
public interface CarAccidentrepository extends JpaRepository<CarsAppAccident, String> {
List<CarsAppAccident> findByAccidentExpertUserIdOrderByCreatedDesc(String accidentExpertUserId);
}
