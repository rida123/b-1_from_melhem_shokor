package com.claimsExpress.Esurvey.requests;

import java.util.List;



public class CarsSurveyDamagedPartsListRequest {
	
	private java.lang.String carId;

	private List<CarsSurveyDamagedPartsListRequest> carsSurveyDamagedPartsBean;

	

	public java.lang.String getCarId() {
		return carId;
	}

	public void setCarId(java.lang.String carId) {
		this.carId = carId;
	}

	public List<CarsSurveyDamagedPartsListRequest> getCarsSurveyDamagedPartsBean() {
		return carsSurveyDamagedPartsBean;
	}

	public void setCarsSurveyDamagedPartsBean(List<CarsSurveyDamagedPartsListRequest> carsSurveyDamagedPartsBean) {
		this.carsSurveyDamagedPartsBean = carsSurveyDamagedPartsBean;
	}


	
}
