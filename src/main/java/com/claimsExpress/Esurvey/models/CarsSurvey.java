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
@Table(name="CARS_SURVEY")
@EntityListeners(AuditingEntityListener.class)
public class CarsSurvey  implements Cloneable {

	private static Log logger = LogFactory.getLog(CarsSurvey.class);

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SURVEY_ID")
	private java.lang.String surveyId;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SURVEY_CAR_ID",nullable=false)
	private CarLossCar surveyCarId;

	@Column(name="SURVEY_SEQUENCE")
	private java.lang.String surveySequence;

	@Column(name="SURVEY_DATE")
	private java.sql.Timestamp surveyDate;

	@Column(name="SURVEY_SHEET")
	private java.lang.String surveySheet;

	@Column(name="SURVEY_MAJOR_DAMAGE")
	private java.lang.String surveyMajorDamage;

	@Column(name="SURVEY_NOT_MAJOR_DAMAGE")
	private java.lang.String surveyNotMajorDamage;
	
	@Column(name="SURVEY_PIC")
	private java.lang.String surveyPic;
	
	public CarLossCar getSurveyCarId() {
		return surveyCarId;
	}

	public void setSurveyCarId(CarLossCar surveyCarId) {
		this.surveyCarId = surveyCarId;
	}

	@Column(name="SURVEY_SUPPLIER_ID")
	private java.lang.String surveySupplierId;
	
	@Column(name="SYS_CREATED_BY")
	private java.lang.String sysCreatedBy;

	@Column(name="SYS_CREATED_DATE")
	private java.sql.Timestamp sysCreatedDate;
	
	@Column(name="SURVEY_SHEET_DATE")
	private java.sql.Timestamp surveySheetDate;
	
	@Column(name="SYS_UPDATED_DATE")
	private java.sql.Timestamp sysUpdatedDate;

	@Column(name="SYS_UPDATED_BY")
	private java.lang.String sysUpdatedBy;
	
	@Column(name="SURVEY_REMARKS")
	private java.lang.String surveyRemarks;
	
	@Column(name="SURVEY_PLACE")
	private java.lang.String surveyPlace;

	public CarsSurvey() {
		super();
	}

	public CarsSurvey(java.lang.String surveyId) {
		super();

		this.setSurveyId(surveyId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public java.lang.String getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(java.lang.String surveyId) {
		this.surveyId = surveyId;
	}

	

	public java.lang.String getSurveySequence() {
		return surveySequence;
	}

	public void setSurveySequence(java.lang.String surveySequence) {
		this.surveySequence = surveySequence;
	}

	public java.sql.Timestamp getSurveyDate() {
		return surveyDate;
	}

	public void setSurveyDate(java.sql.Timestamp surveyDate) {
		this.surveyDate = surveyDate;
	}

	public java.lang.String getSurveySheet() {
		return surveySheet;
	}

	public void setSurveySheet(java.lang.String surveySheet) {
		this.surveySheet = surveySheet;
	}

	public java.lang.String getSurveyMajorDamage() {
		return surveyMajorDamage;
	}

	public void setSurveyMajorDamage(java.lang.String surveyMajorDamage) {
		this.surveyMajorDamage = surveyMajorDamage;
	}

	public java.lang.String getSurveyNotMajorDamage() {
		return surveyNotMajorDamage;
	}

	public void setSurveyNotMajorDamage(java.lang.String surveyNotMajorDamage) {
		this.surveyNotMajorDamage = surveyNotMajorDamage;
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

	public java.lang.String getSurveyRemarks() {
		return surveyRemarks;
	}

	public void setSurveyRemarks(java.lang.String surveyRemarks) {
		this.surveyRemarks = surveyRemarks;
	}

	public java.lang.String getSurveyPlace() {
		return surveyPlace;
	}

	public void setSurveyPlace(java.lang.String surveyPlace) {
		this.surveyPlace = surveyPlace;
	}

	public java.sql.Timestamp getSurveySheetDate() {
		return surveySheetDate;
	}

	public void setSurveySheetDate(java.sql.Timestamp surveySheetDate) {
		this.surveySheetDate = surveySheetDate;
	}

	public java.lang.String getSurveyPic() {
		return surveyPic;
	}

	public void setSurveyPic(java.lang.String surveyPic) {
		this.surveyPic = surveyPic;
	}

	public java.lang.String getSurveySupplierId() {
		return surveySupplierId;
	}

	public void setSurveySupplierId(java.lang.String surveySupplierId) {
		this.surveySupplierId = surveySupplierId;
	}

}
