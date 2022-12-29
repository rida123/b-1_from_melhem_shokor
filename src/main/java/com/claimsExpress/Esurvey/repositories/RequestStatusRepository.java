package com.claimsExpress.Esurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarBrand;
import com.claimsExpress.Esurvey.models.CarLossCar;
import com.claimsExpress.Esurvey.models.CarsLossResp;
import com.claimsExpress.Esurvey.models.Company;
import com.claimsExpress.Esurvey.models.RequestStatus;
@Repository
@EnableJpaRepositories
public interface RequestStatusRepository extends JpaRepository<RequestStatus, String> {

}
