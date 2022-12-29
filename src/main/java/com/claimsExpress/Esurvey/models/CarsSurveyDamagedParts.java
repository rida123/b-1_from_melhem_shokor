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
@Table(name="CARS_SURVEY_DAMAGED_PARTS")
@EntityListeners(AuditingEntityListener.class)
public class CarsSurveyDamagedParts  implements Cloneable {
	
	private static Log logger = LogFactory.getLog(CarsSurveyDamagedParts.class);

	@Column(name="SURVEY_DAMAGED_BROKABLE")
	private java.lang.Integer surveyDamagedBrokable;
	
	@Column(name="SURVEY_DAMAGED_CHECK_COMPANY")
	private java.lang.Integer surveyDamagedCheckCompany;
	
	@Column(name="SURVEY_DAMAGED_DESCRIPTION")
	private java.lang.String surveyDamagedDescription;
	
	@Id
	@Column(name="SURVEY_DAMAGED_PARTS_ID")
	private java.lang.String surveyDamagedPartsId;
	
	@Column(name="SURVEY_DAMAGED_PART_CODE")
	private java.lang.Integer surveyDamagedPartCode;
	
	@Column(name="SURVEY_DAMAGED_REVIEW")
	private java.lang.String surveyDamagedReview;
	
	@Column(name="SURVEY_DAMAGED_SEVERITY")
	private java.lang.Integer surveyDamagedSeverity;
	
	@Column(name="SURVEY_DAMAGED_SURVEY_ID")
	private java.lang.String surveyDamagedSurveyId;
	
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
	
	@Column(name="MET_PARENT_PART")
	private java.lang.String metParentPart;



	

	public CarsSurveyDamagedParts() {
		super();
	}

	public CarsSurveyDamagedParts(java.lang.String surveyId) {
		super();

		this.setSurveyDamagedPartsId(surveyId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	
	
	public java.lang.String getSurveyDamagedSurveyId() {
		return surveyDamagedSurveyId;
	}

	public void setSurveyDamagedSurveyId(java.lang.String surveyDamagedSurveyId) {
		this.surveyDamagedSurveyId = surveyDamagedSurveyId;
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



	public java.lang.String getSurveyDamagedPartsId() {
		return surveyDamagedPartsId;
	}

	public void setSurveyDamagedPartsId(java.lang.String surveyDamagedPartsId) {
		this.surveyDamagedPartsId = surveyDamagedPartsId;
	}

	

	

	public java.lang.String getSurveyDamagedReview() {
		return surveyDamagedReview;
	}

	public void setSurveyDamagedReview(java.lang.String surveyDamagedReview) {
		this.surveyDamagedReview = surveyDamagedReview;
	}

	public java.lang.Integer getSurveyDamagedBrokable() {
		return surveyDamagedBrokable;
	}

	public void setSurveyDamagedBrokable(java.lang.Integer surveyDamagedBrokable) {
		this.surveyDamagedBrokable = surveyDamagedBrokable;
	}

	public java.lang.Integer getSurveyDamagedCheckCompany() {
		return surveyDamagedCheckCompany;
	}

	public void setSurveyDamagedCheckCompany(java.lang.Integer surveyDamagedCheckCompany) {
		this.surveyDamagedCheckCompany = surveyDamagedCheckCompany;
	}

	public java.lang.Integer getSurveyDamagedPartCode() {
		return surveyDamagedPartCode;
	}

	public void setSurveyDamagedPartCode(java.lang.Integer surveyDamagedPartCode) {
		this.surveyDamagedPartCode = surveyDamagedPartCode;
	}

	public java.lang.Integer getSurveyDamagedSeverity() {
		return surveyDamagedSeverity;
	}

	public void setSurveyDamagedSeverity(java.lang.Integer surveyDamagedSeverity) {
		this.surveyDamagedSeverity = surveyDamagedSeverity;
	}

	public java.lang.String getMetParentPart() {
		return metParentPart;
	}

	public void setMetParentPart(java.lang.String metParentPart) {
		this.metParentPart = metParentPart;
	}

}
