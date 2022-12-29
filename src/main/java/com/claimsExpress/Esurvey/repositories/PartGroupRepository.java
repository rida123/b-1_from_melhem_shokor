package com.claimsExpress.Esurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarBrand;
import com.claimsExpress.Esurvey.models.CarLossCar;
import com.claimsExpress.Esurvey.models.CarsSurvey;
import com.claimsExpress.Esurvey.models.CarsSurveyDamage;
import com.claimsExpress.Esurvey.models.CarsSurveyDamagedParts;
import com.claimsExpress.Esurvey.models.Company;
import com.claimsExpress.Esurvey.models.PartGroup;
@Repository
@EnableJpaRepositories
public interface PartGroupRepository extends JpaRepository<PartGroup, Long> {

}
