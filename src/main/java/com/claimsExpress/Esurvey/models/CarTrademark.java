package com.claimsExpress.Esurvey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="CARS_CAR_TRADEMARK")
@EntityListeners(AuditingEntityListener.class)
public class CarTrademark  implements Cloneable {

	private static Log logger = LogFactory.getLog(CarTrademark.class);

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CAR_TRADEMARK_ID")
	private java.lang.String carTrademarkId;
	@Column(name="CAR_TRADEMARK_DESCRIPTION")

	private java.lang.String carTrademarkDescription;
	
@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="carBrandId",nullable=false)
	private CarBrand carBrand;

	public CarTrademark() {
		super();
	}

	public CarTrademark(java.lang.String carTrademarkId) {
		super();

		this.setCarTrademarkId(carTrademarkId);
	}



	




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

	public CarBrand getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}

	


}
