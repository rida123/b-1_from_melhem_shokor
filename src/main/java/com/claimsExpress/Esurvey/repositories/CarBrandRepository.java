package com.claimsExpress.Esurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarBrand;
import com.claimsExpress.Esurvey.models.Company;
@Repository
@EnableJpaRepositories
public interface CarBrandRepository extends JpaRepository<CarBrand, Long> {

}
