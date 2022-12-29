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
@Table(name="CARS_SURVEY_DAMAGED")
@EntityListeners(AuditingEntityListener.class)
public class CarsSurveyDamage  implements Cloneable {

	private static Log logger = LogFactory.getLog(CarsSurveyDamage.class);

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="SURVEY_DAMAGED_ID")
	private java.lang.String surveyDamagedId;

	@Column(name="SURVEY_DAMAGED_SURVEY_ID")
	private java.lang.String surveyDamagedSurveyId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SURVEY_DAMAGED_CAR_ID",nullable=false)
	private CarLossCar surveyDamagedCarId;
	
	public CarLossCar getSurveyDamagedCarId() {
		return surveyDamagedCarId;
	}

	public void setSurveyDamagedCarId(CarLossCar surveyDamagedCarId) {
		this.surveyDamagedCarId = surveyDamagedCarId;
	}

	@Column(name="SURVEY_DAMAGED_VEHICLE_SIZE")
	private java.lang.String surveyDamagedVehicleSize;
	
	@Column(name="SURVEY_DAMAGED_BODY_TYPE")
	private java.lang.String surveyDamagedBodyType;
	
	@Column(name="SURVEY_DAMAGED_DOORS")
	private java.lang.String surveyDamagedDoors;
	
	@Column(name="SURVEY_DAMAGED_DESCRIPTION")
	private java.lang.String surveyDamagedDescription;
	
	@Column(name="SYS_VERSION_NUMBER")
	private java.lang.Integer sysVersionNumber;

	@Column(name="SYS_CREATED_DATE")
	private java.sql.Timestamp sysCreatedDate;
	
	@Column(name="SYS_CREATED_BY")
	private java.lang.String sysCreatedBy;
	
	@Column(name="SYS_UPDATED_DATE")
	private java.sql.Timestamp sysUpdatedDate;

	@Column(name="SYS_UPDATED_BY")
	private java.lang.String sysUpdatedBy;

	@Column(name="SURVEY_DAMAGED_LOCKED_DATE")
	private java.sql.Timestamp surveyDamagedLockedDate;
	
	@Column(name="SURVEY_DAMAGED_LOCKED_USER")
	private java.lang.String surveyDamagedLockedUser;
	

	public CarsSurveyDamage() {
		super();
	}

	public CarsSurveyDamage(java.lang.String surveyId) {
		super();

		this.setSurveyDamagedId(surveyId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}



	public java.lang.String getSurveyDamagedId() {
		return surveyDamagedId;
	}

	public void setSurveyDamagedId(java.lang.String surveyDamagedId) {
		this.surveyDamagedId = surveyDamagedId;
	}

	public java.lang.String getSurveyDamagedSurveyId() {
		return surveyDamagedSurveyId;
	}

	public void setSurveyDamagedSurveyId(java.lang.String surveyDamagedSurveyId) {
		this.surveyDamagedSurveyId = surveyDamagedSurveyId;
	}

	

	public java.lang.String getSurveyDamagedVehicleSize() {
		return surveyDamagedVehicleSize;
	}

	public void setSurveyDamagedVehicleSize(java.lang.String surveyDamagedVehicleSize) {
		this.surveyDamagedVehicleSize = surveyDamagedVehicleSize;
	}

	public java.lang.String getSurveyDamagedBodyType() {
		return surveyDamagedBodyType;
	}

	public void setSurveyDamagedBodyType(java.lang.String surveyDamagedBodyType) {
		this.surveyDamagedBodyType = surveyDamagedBodyType;
	}

	public java.lang.String getSurveyDamagedDoors() {
		return surveyDamagedDoors;
	}

	public void setSurveyDamagedDoors(java.lang.String surveyDamagedDoors) {
		this.surveyDamagedDoors = surveyDamagedDoors;
	}

	public java.lang.String getSurveyDamagedDescription() {
		return surveyDamagedDescription;
	}

	public void setSurveyDamagedDescription(java.lang.String surveyDamagedDescription) {
		this.surveyDamagedDescription = surveyDamagedDescription;
	}

	public java.lang.Integer getSysVersionNumber() {
		return sysVersionNumber;
	}

	public void setSysVersionNumber(java.lang.Integer sysVersionNumber) {
		this.sysVersionNumber = sysVersionNumber;
	}

	public java.sql.Timestamp getSysCreatedDate() {
		return sysCreatedDate;
	}

	public void setSysCreatedDate(java.sql.Timestamp sysCreatedDate) {
		this.sysCreatedDate = sysCreatedDate;
	}

	public java.lang.String getSysCreatedBy() {
		return sysCreatedBy;
	}

	public void setSysCreatedBy(java.lang.String sysCreatedBy) {
		this.sysCreatedBy = sysCreatedBy;
	}

	public java.sql.Timestamp getSysUpdatedDate() {
		return sysUpdatedDate;
	}

	public void setSysUpdatedDate(java.sql.Timestamp sysUpdatedDate) {
		this.sysUpdatedDate = sysUpdatedDate;
	}

	public java.lang.String getSysUpdatedBy() {
		return sysUpdatedBy;
	}

	public void setSysUpdatedBy(java.lang.String sysUpdatedBy) {
		this.sysUpdatedBy = sysUpdatedBy;
	}

	public java.sql.Timestamp getSurveyDamagedLockedDate() {
		return surveyDamagedLockedDate;
	}

	public void setSurveyDamagedLockedDate(java.sql.Timestamp surveyDamagedLockedDate) {
		this.surveyDamagedLockedDate = surveyDamagedLockedDate;
	}

	public java.lang.String getSurveyDamagedLockedUser() {
		return surveyDamagedLockedUser;
	}

	public void setSurveyDamagedLockedUser(java.lang.String surveyDamagedLockedUser) {
		this.surveyDamagedLockedUser = surveyDamagedLockedUser;
	}

	
}
