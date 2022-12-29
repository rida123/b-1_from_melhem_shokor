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
@Table(name="CARS_SURVEY_REQUEST_STATUS")
@EntityListeners(AuditingEntityListener.class)
public class RequestStatus implements Cloneable {

	private static Log logger = LogFactory.getLog(Company.class);

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAR_SUR_REQ_STA_ID")
	private java.lang.String requestStatusId;
	
	@Column(name="CAR_SUR_REQ_STA_CAR_ID")
	private java.lang.String requestStatusCarId;
	
	@Column(name="CAR_SUR_REQ_STA_USER_ID")
	private java.lang.String requestStatusUserId;
	
	@Column(name="CAR_SUR_REQ_STA_TYPOLOGY")
	private java.lang.String requestStatusTypology;
	
	@Column(name="SYS_CREATED_DATE")
	private java.sql.Timestamp sysCreatedDate;
	
	@Column(name="SYS_CREATED_BY")
	private java.lang.String sysCreatedBy;
	
	@Column(name="CAR_SUR_REQ_STA_LONGITUDE")
	private java.lang.String requestStatusLongitutde;
	
	@Column(name="CAR_SUR_REQ_STA_LATITUDE")
	private java.lang.String requestStatusLatitude;

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	

	public java.lang.String getRequestStatusId() {
		return requestStatusId;
	}

	public void setRequestStatusId(java.lang.String requestStatusId) {
		this.requestStatusId = requestStatusId;
	}

	public java.lang.String getRequestStatusCarId() {
		return requestStatusCarId;
	}

	public void setRequestStatusCarId(java.lang.String requestStatusCarId) {
		this.requestStatusCarId = requestStatusCarId;
	}

	public java.lang.String getRequestStatusUserId() {
		return requestStatusUserId;
	}

	public void setRequestStatusUserId(java.lang.String requestStatusUserId) {
		this.requestStatusUserId = requestStatusUserId;
	}

	public java.lang.String getRequestStatusTypology() {
		return requestStatusTypology;
	}

	public void setRequestStatusTypology(java.lang.String requestStatusTypology) {
		this.requestStatusTypology = requestStatusTypology;
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

	public java.lang.String getRequestStatusLongitutde() {
		return requestStatusLongitutde;
	}

	public void setRequestStatusLongitutde(java.lang.String requestStatusLongitutde) {
		this.requestStatusLongitutde = requestStatusLongitutde;
	}

	public java.lang.String getRequestStatusLatitude() {
		return requestStatusLatitude;
	}

	public void setRequestStatusLatitude(java.lang.String requestStatusLatitude) {
		this.requestStatusLatitude = requestStatusLatitude;
	}

	

}
