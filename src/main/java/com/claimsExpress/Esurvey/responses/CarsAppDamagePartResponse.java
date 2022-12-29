package com.claimsExpress.Esurvey.responses;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import com.claimsExpress.Esurvey.models.CarsAppAccident;

public class CarsAppDamagePartResponse {
	private String  damagedPartsId ;
	private String carsAppAccidentId ;
	private String  damagesPartsPartId ;
	public String getDamagedPartsId() {
		return damagedPartsId;
	}
	public void setDamagedPartsId(String damagedPartsId) {
		this.damagedPartsId = damagedPartsId;
	}
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
