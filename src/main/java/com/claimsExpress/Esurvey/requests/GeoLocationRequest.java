package com.claimsExpress.Esurvey.requests;

import javax.persistence.Column;

public class GeoLocationRequest {
	
    private  String longitude ;
    private  String latitude ;
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
    
}
