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
@Table(name="CARS_SURVEY_REQUEST")
@EntityListeners(AuditingEntityListener.class)
public class CarsSurveyRequest  implements Cloneable {

	private static Log logger = LogFactory.getLog(CarsSurveyRequest.class);

	private static final long serialVersionUID = 1L;

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SURVEY_REQUEST_CAR_ID",nullable=false)
	private CarLossCar surveyRequestCarId;
	
	public CarLossCar getSurveyRequestCarId() {
		return surveyRequestCarId;
	}

	public void setSurveyRequestCarId(CarLossCar surveyRequestCarId) {
		this.surveyRequestCarId = surveyRequestCarId;
	}

	@Column(name="SURVEY_REQUEST_ADDRESS")
	private java.lang.String surveyRequestAddress;
	
	@Column(name="SURVEY_REQUEST_CANCELED")
	private java.lang.String surveyRequestCancelled;
	
	@Column(name="SURVEY_REQUEST_DATE")
	private java.sql.Timestamp surveyRequestDate;
	
	@Column(name="SURVEY_REQUEST_GARAGE_ID")
	private java.lang.String surveyRequestGarageId;
	
	@Column(name="SURVEY_REQUEST_GARAGE_NAME")
	private java.lang.String surveyRequestGarageName;
	
	@Column(name="SURVEY_REQUEST_NOTE")
	private java.lang.String surveyRequestNote;
	
	@Column(name="SURVEY_REQUEST_ORDER")
	private java.lang.String surveyRequestOrder;
	
	@Column(name="SURVEY_REQUEST_PHONE")
	private java.lang.String surveyRequestPhone;
	
	@Column(name="SURVEY_REQUEST_SURVEYOR_ID")
	private java.lang.String surveyRequestSurveyorId;
	
	@Column(name="SURVEY_REQUEST_TOWN_ID")
	private java.lang.String surveyRequestTownId;
	
	@Column(name="SURVEY_REQUEST_VIP")
	private java.lang.String surveyRequestVip;
	
	@Column(name="RE_SURVEY_REQUEST")
	private java.lang.String reSurveyRequest;
	
	@Id
	@Column(name="SURVEY_REQUEST_ID")
	private java.lang.String surveyRequestId;
	
	@Column(name="SURVEY_REQUEST_USER")
	private java.lang.String surveyRequestUser;
	
	@Column(name="SURVEY_DISPATCH_DATE")
	private java.sql.Timestamp surveyDispatchDate;
	
	@Column(name="SURVEY_DISPATCH_USER")
	private java.lang.String surveyDispatchUser;
	
	@Column(name="SURVEY_DISPATCH_NOTE")
	private java.lang.String surveyDispatchNote;
	
	@Column(name="SURVEY_REQUEST_STATUS")
	private java.lang.String surveyRequestStatus;
	
	@Column(name="SURVEY_DEPARTURE_TOWN_ID")
	private java.lang.String surveyDepartureTownId;
	
	@Column(name="SYS_VERSION_NUMBER")
	private java.lang.String sysVersionNumber;
	
	@Column(name="SYS_CREATED_DATE")
	private java.sql.Timestamp sysCreatedDate;
	
	@Column(name="SYS_CREATED_BY")
	private java.lang.String sysCreatedBy;
	
	@Column(name="SYS_UPDATED_DATE")
	private java.sql.Timestamp sysUpdatedDate;
	
	@Column(name="SYS_UPDATED_BY")
	private java.lang.String sysUpdatedBy;
	
	@Column(name="SURVEY_REQUEST_SEQUENCE")
	private java.lang.String surveyRequestSequence;
	
	@Column(name="SURVEY_REQUEST_MATERIAL_ID")
	private java.lang.String surveyRequestMaterialId;
	
	@Column(name="SURVEY_COST")
	private java.lang.String surveyCost;
	
	@Column(name="SURVEY_DISPATCH_LOG_DATE")
	private java.sql.Timestamp surveyDispatchLogDate;
	
	@Column(name="SURVEY_WANT_TO_REPAIR")
	private java.lang.String surveyWantToRepair;
	
	@Column(name="SURVEY_UNDER_REPAIR")
	private java.lang.String surveyUnderRepair;
	
	@Column(name="SURVEY_REQUEST_CANCEL_REASON")
	private java.lang.String surveyRequestCancelReason;
	
	@Column(name="SURVEY_REQUEST_CANCEL_USER")
	private java.lang.String surveyRequestCancelUser;
	
	@Column(name="SURVEY_REQUEST_CANCEL_DATE")
	private java.sql.Timestamp surveyRequestCancelDate;
	
	@Column(name="SURVEY_REQUEST_CANCEL_NOTE")
	private java.lang.String surveyRequestCancelNote;


	public CarsSurveyRequest() {
		super();
	}

	public CarsSurveyRequest(java.lang.String surveyRequestId) {
		super();

		this.setSurveyRequestId(surveyRequestId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public java.lang.String getSurveyRequestAddress() {
		return surveyRequestAddress;
	}

	public void setSurveyRequestAddress(java.lang.String surveyRequestAddress) {
		this.surveyRequestAddress = surveyRequestAddress;
	}

	public java.lang.String getSurveyRequestCancelled() {
		return surveyRequestCancelled;
	}

	public void setSurveyRequestCancelled(java.lang.String surveyRequestCancelled) {
		this.surveyRequestCancelled = surveyRequestCancelled;
	}

	public java.sql.Timestamp getSurveyRequestDate() {
		return surveyRequestDate;
	}

	public void setSurveyRequestDate(java.sql.Timestamp surveyRequestDate) {
		this.surveyRequestDate = surveyRequestDate;
	}

	public java.lang.String getSurveyRequestGarageId() {
		return surveyRequestGarageId;
	}

	public void setSurveyRequestGarageId(java.lang.String surveyRequestGarageId) {
		this.surveyRequestGarageId = surveyRequestGarageId;
	}

	public java.lang.String getSurveyRequestGarageName() {
		return surveyRequestGarageName;
	}

	public void setSurveyRequestGarageName(java.lang.String surveyRequestGarageName) {
		this.surveyRequestGarageName = surveyRequestGarageName;
	}

	public java.lang.String getSurveyRequestNote() {
		return surveyRequestNote;
	}

	public void setSurveyRequestNote(java.lang.String surveyRequestNote) {
		this.surveyRequestNote = surveyRequestNote;
	}

	public java.lang.String getSurveyRequestOrder() {
		return surveyRequestOrder;
	}

	public void setSurveyRequestOrder(java.lang.String surveyRequestOrder) {
		this.surveyRequestOrder = surveyRequestOrder;
	}

	public java.lang.String getSurveyRequestPhone() {
		return surveyRequestPhone;
	}

	public void setSurveyRequestPhone(java.lang.String surveyRequestPhone) {
		this.surveyRequestPhone = surveyRequestPhone;
	}

	public java.lang.String getSurveyRequestSurveyorId() {
		return surveyRequestSurveyorId;
	}

	public void setSurveyRequestSurveyorId(java.lang.String surveyRequestSurveyorId) {
		this.surveyRequestSurveyorId = surveyRequestSurveyorId;
	}

	public java.lang.String getSurveyRequestTownId() {
		return surveyRequestTownId;
	}

	public void setSurveyRequestTownId(java.lang.String surveyRequestTownId) {
		this.surveyRequestTownId = surveyRequestTownId;
	}

	public java.lang.String getSurveyRequestVip() {
		return surveyRequestVip;
	}

	public void setSurveyRequestVip(java.lang.String surveyRequestVip) {
		this.surveyRequestVip = surveyRequestVip;
	}

	public java.lang.String getReSurveyRequest() {
		return reSurveyRequest;
	}

	public void setReSurveyRequest(java.lang.String reSurveyRequest) {
		this.reSurveyRequest = reSurveyRequest;
	}

	public java.lang.String getSurveyRequestUser() {
		return surveyRequestUser;
	}

	public void setSurveyRequestUser(java.lang.String surveyRequestUser) {
		this.surveyRequestUser = surveyRequestUser;
	}

	public java.sql.Timestamp getSurveyDispatchDate() {
		return surveyDispatchDate;
	}

	public void setSurveyDispatchDate(java.sql.Timestamp surveyDispatchDate) {
		this.surveyDispatchDate = surveyDispatchDate;
	}

	public java.lang.String getSurveyDispatchUser() {
		return surveyDispatchUser;
	}

	public void setSurveyDispatchUser(java.lang.String surveyDispatchUser) {
		this.surveyDispatchUser = surveyDispatchUser;
	}

	public java.lang.String getSurveyDispatchNote() {
		return surveyDispatchNote;
	}

	public void setSurveyDispatchNote(java.lang.String surveyDispatchNote) {
		this.surveyDispatchNote = surveyDispatchNote;
	}

	public java.lang.String getSurveyRequestStatus() {
		return surveyRequestStatus;
	}

	public void setSurveyRequestStatus(java.lang.String surveyRequestStatus) {
		this.surveyRequestStatus = surveyRequestStatus;
	}

	public java.lang.String getSurveyDepartureTownId() {
		return surveyDepartureTownId;
	}

	public void setSurveyDepartureTownId(java.lang.String surveyDepartureTownId) {
		this.surveyDepartureTownId = surveyDepartureTownId;
	}

	public java.lang.String getSysVersionNumber() {
		return sysVersionNumber;
	}

	public void setSysVersionNumber(java.lang.String sysVersionNumber) {
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

	public java.lang.String getSurveyRequestSequence() {
		return surveyRequestSequence;
	}

	public void setSurveyRequestSequence(java.lang.String surveyRequestSequence) {
		this.surveyRequestSequence = surveyRequestSequence;
	}

	public java.lang.String getSurveyRequestMaterialId() {
		return surveyRequestMaterialId;
	}

	public void setSurveyRequestMaterialId(java.lang.String surveyRequestMaterialId) {
		this.surveyRequestMaterialId = surveyRequestMaterialId;
	}

	public java.lang.String getSurveyCost() {
		return surveyCost;
	}

	public void setSurveyCost(java.lang.String surveyCost) {
		this.surveyCost = surveyCost;
	}

	public java.sql.Timestamp getSurveyDispatchLogDate() {
		return surveyDispatchLogDate;
	}

	public void setSurveyDispatchLogDate(java.sql.Timestamp surveyDispatchLogDate) {
		this.surveyDispatchLogDate = surveyDispatchLogDate;
	}

	public java.lang.String getSurveyWantToRepair() {
		return surveyWantToRepair;
	}

	public void setSurveyWantToRepair(java.lang.String surveyWantToRepair) {
		this.surveyWantToRepair = surveyWantToRepair;
	}

	public java.lang.String getSurveyUnderRepair() {
		return surveyUnderRepair;
	}

	public void setSurveyUnderRepair(java.lang.String surveyUnderRepair) {
		this.surveyUnderRepair = surveyUnderRepair;
	}

	public java.lang.String getSurveyRequestCancelReason() {
		return surveyRequestCancelReason;
	}

	public void setSurveyRequestCancelReason(java.lang.String surveyRequestCancelReason) {
		this.surveyRequestCancelReason = surveyRequestCancelReason;
	}

	public java.lang.String getSurveyRequestCancelUser() {
		return surveyRequestCancelUser;
	}

	public void setSurveyRequestCancelUser(java.lang.String surveyRequestCancelUser) {
		this.surveyRequestCancelUser = surveyRequestCancelUser;
	}

	public java.sql.Timestamp getSurveyRequestCancelDate() {
		return surveyRequestCancelDate;
	}

	public void setSurveyRequestCancelDate(java.sql.Timestamp surveyRequestCancelDate) {
		this.surveyRequestCancelDate = surveyRequestCancelDate;
	}

	public java.lang.String getSurveyRequestCancelNote() {
		return surveyRequestCancelNote;
	}

	public void setSurveyRequestCancelNote(java.lang.String surveyRequestCancelNote) {
		this.surveyRequestCancelNote = surveyRequestCancelNote;
	}

	public java.lang.String getSurveyRequestId() {
		return surveyRequestId;
	}

	public void setSurveyRequestId(java.lang.String surveyRequestId) {
		this.surveyRequestId = surveyRequestId;
	}




}
