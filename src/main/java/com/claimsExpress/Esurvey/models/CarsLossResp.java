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
@Table(name="CARS_LOSS_RESP")
@EntityListeners(AuditingEntityListener.class)
public class CarsLossResp  implements Cloneable {

	
	private static Log logger = LogFactory.getLog(CarsLossResp.class);

	private static final long serialVersionUID = 1L;

	public CarLossCar getRepStatusCarId() {
		return repStatusCarId;
	}



	public void setRepStatusCarId(CarLossCar repStatusCarId) {
		this.repStatusCarId = repStatusCarId;
	}

	@Column(name="RESP_STATUS_STATE")
	private java.lang.String respStatusState;
	@Column(name="RESP_STATUS_INSURANCE")
	private java.lang.Integer respStatusInsurance;
	@Column(name="RESP_STATUS_VISA")
	private java.lang.Integer respStatusVisa;
	@Column(name="RESP_STATUS_CAR")
	private java.lang.Integer respStatusCar;
	@Column(name="RESP_STATUS_OTHER")
	private java.lang.Integer respStatusOther;
	@Column(name="RESP_STATUS_RESP")
	private java.lang.Integer respStatusResp;
	@Column(name="RESP_STATUS_REMARKS")
	private java.lang.String respStatusRemarks;
	@Column(name="RESP_STATUS")
	private java.lang.String respStatus;
	@Column(name="RESP_STATUS_EVALUATOR")
	private java.lang.Integer respStatusEvaluator;
	@Column(name="LOG_USER")
	private java.lang.String logUser;
	@Column(name="LOG_DATE_TIME")
	private java.sql.Timestamp logDateTime;
	@Column(name="LOG_COMPUTER")
	private java.lang.String logComputer;
	@Column(name="LOG_SOFTWARE")
	private java.lang.String logSoftware;
	@Column(name="RESP_STATUS_REPORTED_DATEJ")
	private java.lang.Integer respStatusReportedDateJ;
	@Column(name="RESP_STATUS_REMOVE_APPROVAL")
	private java.lang.String respStatusRemoveApproval;
	@Id
	@Column(name="REP_STATUS_ID")
	private java.lang.String repStatusId;
	
	
	
	
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="REP_STATUS_CAR_ID",nullable=false)
	private CarLossCar  repStatusCarId;
	
	
	
	@Column(name="RESP_STATUS_BODILY_ID")
	private java.lang.String respStatusBodilyId;
	@Column(name="RESP_STATUS_MATERIAL_ID")
	private java.lang.String respStatusMaterialId;
	@Column(name="RESP_STATUS_OTHER_ID")
	private java.lang.String respStatusOtherId;
	@Column(name="RESP_STATUS_BOD_OTH_ID")
	private java.lang.String respStatusBodOthId;
	@Column(name="RESP_STATUS_MAT_OTH_ID")
	private java.lang.String respStatusMatOthId;
	@Column(name="RESP_STATUS_REPORTED_DATE")
	private java.sql.Timestamp respStatusReportedDate;
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
	
	
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}



	public java.lang.String getRespStatusState() {
		return respStatusState;
	}

	public void setRespStatusState(java.lang.String respStatusState) {
		this.respStatusState = respStatusState;
	}

	public java.lang.Integer getRespStatusInsurance() {
		return respStatusInsurance;
	}

	public void setRespStatusInsurance(java.lang.Integer respStatusInsurance) {
		this.respStatusInsurance = respStatusInsurance;
	}

	public java.lang.Integer getRespStatusVisa() {
		return respStatusVisa;
	}

	public void setRespStatusVisa(java.lang.Integer respStatusVisa) {
		this.respStatusVisa = respStatusVisa;
	}

	public java.lang.Integer getRespStatusCar() {
		return respStatusCar;
	}

	public void setRespStatusCar(java.lang.Integer respStatusCar) {
		this.respStatusCar = respStatusCar;
	}

	public java.lang.Integer getRespStatusOther() {
		return respStatusOther;
	}

	public void setRespStatusOther(java.lang.Integer respStatusOther) {
		this.respStatusOther = respStatusOther;
	}

	public java.lang.Integer getRespStatusResp() {
		return respStatusResp;
	}

	public void setRespStatusResp(java.lang.Integer respStatusResp) {
		this.respStatusResp = respStatusResp;
	}

	public java.lang.String getRespStatusRemarks() {
		return respStatusRemarks;
	}

	public void setRespStatusRemarks(java.lang.String respStatusRemarks) {
		this.respStatusRemarks = respStatusRemarks;
	}

	public java.lang.String getRespStatus() {
		return respStatus;
	}

	public void setRespStatus(java.lang.String respStatus) {
		this.respStatus = respStatus;
	}

	public java.lang.Integer getRespStatusEvaluator() {
		return respStatusEvaluator;
	}

	public void setRespStatusEvaluator(java.lang.Integer respStatusEvaluator) {
		this.respStatusEvaluator = respStatusEvaluator;
	}

	public java.lang.String getLogUser() {
		return logUser;
	}

	public void setLogUser(java.lang.String logUser) {
		this.logUser = logUser;
	}

	public java.sql.Timestamp getLogDateTime() {
		return logDateTime;
	}

	public void setLogDateTime(java.sql.Timestamp logDateTime) {
		this.logDateTime = logDateTime;
	}

	public java.lang.String getLogComputer() {
		return logComputer;
	}

	public void setLogComputer(java.lang.String logComputer) {
		this.logComputer = logComputer;
	}

	public java.lang.String getLogSoftware() {
		return logSoftware;
	}

	public void setLogSoftware(java.lang.String logSoftware) {
		this.logSoftware = logSoftware;
	}

	public java.lang.Integer getRespStatusReportedDateJ() {
		return respStatusReportedDateJ;
	}

	public void setRespStatusReportedDateJ(java.lang.Integer respStatusReportedDateJ) {
		this.respStatusReportedDateJ = respStatusReportedDateJ;
	}

	public java.lang.String getRespStatusRemoveApproval() {
		return respStatusRemoveApproval;
	}

	public void setRespStatusRemoveApproval(java.lang.String respStatusRemoveApproval) {
		this.respStatusRemoveApproval = respStatusRemoveApproval;
	}

	public java.lang.String getRepStatusId() {
		return repStatusId;
	}

	public void setRepStatusId(java.lang.String repStatusId) {
		this.repStatusId = repStatusId;
	}



	public java.lang.String getRespStatusBodilyId() {
		return respStatusBodilyId;
	}

	public void setRespStatusBodilyId(java.lang.String respStatusBodilyId) {
		this.respStatusBodilyId = respStatusBodilyId;
	}

	public java.lang.String getRespStatusMaterialId() {
		return respStatusMaterialId;
	}

	public void setRespStatusMaterialId(java.lang.String respStatusMaterialId) {
		this.respStatusMaterialId = respStatusMaterialId;
	}

	public java.lang.String getRespStatusOtherId() {
		return respStatusOtherId;
	}

	public void setRespStatusOtherId(java.lang.String respStatusOtherId) {
		this.respStatusOtherId = respStatusOtherId;
	}

	public java.lang.String getRespStatusBodOthId() {
		return respStatusBodOthId;
	}

	public void setRespStatusBodOthId(java.lang.String respStatusBodOthId) {
		this.respStatusBodOthId = respStatusBodOthId;
	}

	public java.lang.String getRespStatusMatOthId() {
		return respStatusMatOthId;
	}

	public void setRespStatusMatOthId(java.lang.String respStatusMatOthId) {
		this.respStatusMatOthId = respStatusMatOthId;
	}

	public java.sql.Timestamp getRespStatusReportedDate() {
		return respStatusReportedDate;
	}

	public void setRespStatusReportedDate(java.sql.Timestamp respStatusReportedDate) {
		this.respStatusReportedDate = respStatusReportedDate;
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


}
