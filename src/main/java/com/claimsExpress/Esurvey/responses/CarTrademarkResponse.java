package com.claimsExpress.Esurvey.responses;

import java.io.Serializable;

public class CarTrademarkResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private java.lang.String carTrademarkId;

	private java.lang.String carTrademarkDescription;

	public java.lang.String getCarTrademarkId() {
		return carTrademarkId;
	}

	public void setCarTrademarkId(java.lang.String carTrademarkId) {
		this.carTrademarkId = carTrademarkId;
	}

	public java.lang.String getCarTrademarkDescription() {
		return carTrademarkDescription;
	}

	public void setCarTrademarkDescription(java.lang.String carTrademarkDescription) {
		this.carTrademarkDescription = carTrademarkDescription;
	}

}
