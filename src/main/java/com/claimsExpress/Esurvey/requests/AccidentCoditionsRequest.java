package com.claimsExpress.Esurvey.requests;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.claimsExpress.Esurvey.models.CarsAppAccident;

public class AccidentCoditionsRequest {





	private String  carsAppAccidentId ;
	
		public String getCarsAppAccidentId() {
		return carsAppAccidentId;
	}

	public void setCarsAppAccidentId(String carsAppAccidentId) {
		this.carsAppAccidentId = carsAppAccidentId;
	}

	public String getAccidentConditionsTPFDamage() {
		return accidentConditionsTPFDamage;
	}

	public void setAccidentConditionsTPFDamage(String accidentConditionsTPFDamage) {
		this.accidentConditionsTPFDamage = accidentConditionsTPFDamage;
	}

	public String getAccidentConditionsResponsib() {
		return accidentConditionsResponsib;
	}

	public void setAccidentConditionsResponsib(String accidentConditionsResponsib) {
		this.accidentConditionsResponsib = accidentConditionsResponsib;
	}

	public String getAccidentConditionsDoubts() {
		return accidentConditionsDoubts;
	}

	public void setAccidentConditionsDoubts(String accidentConditionsDoubts) {
		this.accidentConditionsDoubts = accidentConditionsDoubts;
	}

	public int getAccidentConditiosTPCount() {
		return accidentConditiosTPCount;
	}

	public void setAccidentConditiosTPCount(int accidentConditiosTPCount) {
		this.accidentConditiosTPCount = accidentConditiosTPCount;
	}

		private String  accidentConditionsTPFDamage;
	  
		private String  accidentConditionsResponsib;
	  
	   
			private String  accidentConditionsDoubts;
	   
		private int  accidentConditiosTPCount;
		
		
		
}
