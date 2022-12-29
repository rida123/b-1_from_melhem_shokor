package com.claimsExpress.Esurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarBrand;
import com.claimsExpress.Esurvey.models.CarLossCar;
import com.claimsExpress.Esurvey.models.CarTrademark;
import com.claimsExpress.Esurvey.models.CarsLossResp;
import com.claimsExpress.Esurvey.models.Company;

import com.claimsExpress.Esurvey.models.InsuranceCompany;

@EnableJpaRepositories
@Repository
public interface InsuranceCompanyRepository extends JpaRepository<InsuranceCompany, String> {
	@Query(value=" SELECT SUPPLIER_NAME, SUPPLIER_ID FROM CARS_SUPPLIER WHERE SUPPLIER_INTERM='A' ORDER BY 1 ", nativeQuery = true)
       List<InsuranceCompany> getInsuranceCompany();
}
