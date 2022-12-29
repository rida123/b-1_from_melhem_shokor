package com.claimsExpress.Esurvey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="CARS_CAR_BRAND")
@EntityListeners(AuditingEntityListener.class)
public class CarBrand  implements Cloneable {

	private static Log logger = LogFactory.getLog(CarBrand.class);
	@Id
	@Column(name="CAR_BRAND_ID")
	private java.lang.String carBrandId;
	
	@Column(name="CAR_BRAND_DESCRIPTION")

	private java.lang.String carBrandDescription;

	public CarBrand() {
		super();
	}

	public CarBrand(java.lang.String carBrandId) {
		super();

		this.setCarBrandId(carBrandId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public java.lang.String getCarBrandId() {
		return carBrandId;
	}

	public void setCarBrandId(java.lang.String carBrandId) {
		this.carBrandId = carBrandId;
	}

	public java.lang.String getCarBrandDescription() {
		return carBrandDescription;
	}

	public void setCarBrandDescription(java.lang.String carBrandDescription) {
		this.carBrandDescription = carBrandDescription;
	}

}
