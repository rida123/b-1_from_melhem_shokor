package com.claimsExpress.Esurvey.requests;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import com.claimsExpress.Esurvey.models.CarsAppAccident;

public class CarsAppDamagePartRequest {
	private String carsAppAccidentId ;
	private String  damagesPartsPartId ;
	
	public String getCarsAppAccidentId() {
		return carsAppAccidentId;
	}
	public void setCarsAppAccidentId(String carsAppAccidentId) {
		this.carsAppAccidentId = carsAppAccidentId;
	}
	public String getDamagesPartsPartId() {
		return damagesPartsPartId;
	}
	public void setDamagesPartsPartId(String damagesPartsPartId) {
		this.damagesPartsPartId = damagesPartsPartId;
	}
	
 
}
