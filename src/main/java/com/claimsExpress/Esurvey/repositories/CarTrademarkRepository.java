package com.claimsExpress.Esurvey.repositories;

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
@Repository
@EnableJpaRepositories
public interface CarTrademarkRepository extends JpaRepository<CarTrademark, Long> {
	@Query("select t from CarTrademark t  join fetch  t.carBrand cb where cb.carBrandId = ?1 ")
	List<CarTrademark> getTrademarksbyBrandId(String brandId);

}
