package com.claimsExpress.Esurvey.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarBrand;
import com.claimsExpress.Esurvey.models.CarLossCar;
import com.claimsExpress.Esurvey.models.CarsLossResp;
import com.claimsExpress.Esurvey.models.CarsSurveyRequest;
import com.claimsExpress.Esurvey.models.Company;
@Repository
@EnableJpaRepositories
public interface CarsSurveyRequestRepository extends JpaRepository<CarsSurveyRequest, String> {

	
	@Query(value = " SELECT COUNT(*) FROM CARS_SURVEY_REQUEST WHERE SURVEY_REQUEST_CAR_ID = ?1  ", nativeQuery = true)
	public Long  getCarsSurveyRequestCount(String carId);
	
	@Modifying
	@Query(value = " delete FROM CARS_SURVEY_REQUEST WHERE SURVEY_REQUEST_CAR_ID = trim(?) AND TRUNC (SYS_CREATED_DATE) =  TRUNC(SYSDATE) AND SYS_CREATED_BY = trim(?)  ", nativeQuery = true)
	public void  deleteByCarId(String carId,String userId);
			
	@Query("select c from CarsSurveyRequest c join fetch c.surveyRequestCarId a  where a.carId= ?1")
	public Optional<CarsSurveyRequest>findByCarId(String carId);

}
