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
@Table(name = "CARS_LOSS_CAR")
@EntityListeners(AuditingEntityListener.class)
public class CarLossCar implements Cloneable {

	private static Log logger = LogFactory.getLog(CarLossCar.class);

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CAR_ID")
	private java.lang.String carId;

	@Column(name = "CAR_CLAIM_ID")
	private java.lang.String carClaimId;

	@Column(name = "CAR_SHAPE_ID")
	private java.lang.String carShapeId;
	
//	@Column(name = "CAR_SHAPE_ID")
//	private java.lang.String chasisNumber;
	
	
	
	@Column(name = "CAR_SEQUENCE")
	private java.lang.Integer carSequence;

	@Column(name = "SYS_CREATED_BY")
	private java.lang.String sysCreatedBy;

	@Column(name = "SYS_CREATED_DATE")
	private java.sql.Timestamp sysCreatedDate;

	@Column(name = "SYS_UPDATED_BY")
	private java.lang.String sysUpdatedBy;

	@Column(name = "SYS_UPDATED_DATE")
	private java.sql.Timestamp sysUpdatedDate;

	@Column(name = "CAR_OWNER_FAMILY_NAME")
	private java.lang.String carOwnerFamilyName;

	@Column(name = "CAR_OWNER_FIRST_NAME")
	private java.lang.String carOwnerFirstName;

	@Column(name = "CAR_OWNER_FATHER_NAME")
	private java.lang.String carOwnerFatherName;

	@Column(name = "CAR_OWNER_PHONE")
	private java.lang.String carOwnerPhone;

	@Column(name = "CAR_DRIVER_GENDER")
	private java.lang.String carDriverGender;

	@Column(name = "CAR_YEAR_MANFACT")
	private java.lang.Long carYear;

	@Column(name = "CAR_CAR_BRAND")
	private java.lang.String carBrandId;

	@Column(name = "CAR_CAR_TRADEMARK")
	private java.lang.String carTradeMark;

	@Column(name = "CAR_PLATE")
	private java.lang.String carPlate;
	
	@Column(name = "CAR_DRIVER_LICENSE_NBR")
	private java.lang.String carDriverLicenseNbr;

	@Column(name = "CAR_DRIVER_LICENSE_INCP_DTE")
	private java.sql.Timestamp carDriverLicenseIncpDate;
	@Column(name = "CAR_THRDP_INS_CMPNY_ID")
	private java.lang.String insuranceCompany ;
	@Column(name = "CAR_POLICY_TYPE")
	private java.lang.String carPolicyType ; 
	
	
	public java.lang.String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(java.lang.String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public java.lang.String getCarPolicyType() {
		return carPolicyType;
	}

	public void setCarPolicyType(java.lang.String carPolicyType) {
		this.carPolicyType = carPolicyType;
	}

	public java.sql.Timestamp getCarDriverLicenseIncpDate() {
		return carDriverLicenseIncpDate;
	}

	public void setCarDriverLicenseIncpDate(java.sql.Timestamp carDriverLicenseIncpDate) {
		this.carDriverLicenseIncpDate = carDriverLicenseIncpDate;
	}

	public java.sql.Timestamp getCarDriverLicenseEX() {
		return carDriverLicenseEX;
	}

	public void setCarDriverLicenseEX(java.sql.Timestamp carDriverLicenseEX) {
		this.carDriverLicenseEX = carDriverLicenseEX;
	}

	@Column(name = "CAR_DRIVER_LICENSE_EXP_DTE")
	private java.sql.Timestamp carDriverLicenseEX;

	public static Log getLogger() {
		return logger;
	}

	public static void setLogger(Log logger) {
		CarLossCar.logger = logger;
	}

	public java.lang.Long getCarYear() {
		return carYear;
	}

	public void setCarYear(java.lang.Long carYear) {
		this.carYear = carYear;
	}

	public java.lang.String getCarBrandId() {
		return carBrandId;
	}

	public void setCarBrandId(java.lang.String carBrandId) {
		this.carBrandId = carBrandId;
	}

	public java.lang.String getCarTradeMark() {
		return carTradeMark;
	}

	public void setCarTradeMark(java.lang.String carTradeMark) {
		this.carTradeMark = carTradeMark;
	}

	public java.lang.String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(java.lang.String carPlate) {
		this.carPlate = carPlate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public java.lang.String getCarDriverGender() {
		return carDriverGender;
	}

	public void setCarDriverGender(java.lang.String carDriverGender) {
		this.carDriverGender = carDriverGender;
	}

	

	public java.lang.String getCarOwnerFamilyName() {
		return carOwnerFamilyName;
	}

	public void setCarOwnerFamilyName(java.lang.String carOwnerFamilyName) {
		this.carOwnerFamilyName = carOwnerFamilyName;
	}

	public java.lang.String getCarOwnerFirstName() {
		return carOwnerFirstName;
	}

	public void setCarOwnerFirstName(java.lang.String carOwnerFirstName) {
		this.carOwnerFirstName = carOwnerFirstName;
	}

	public java.lang.String getCarOwnerFatherName() {
		return carOwnerFatherName;
	}

	public void setCarOwnerFatherName(java.lang.String carOwnerFatherName) {
		this.carOwnerFatherName = carOwnerFatherName;
	}

	public java.lang.String getCarOwnerPhone() {
		return carOwnerPhone;
	}

	public void setCarOwnerPhone(java.lang.String carOwnerPhone) {
		this.carOwnerPhone = carOwnerPhone;
	}

	public java.lang.String getCarDriverLicenseNbr() {
		return carDriverLicenseNbr;
	}

	public void setCarDriverLicenseNbr(java.lang.String carDriverLicenseNbr) {
		this.carDriverLicenseNbr = carDriverLicenseNbr;
	}

	
	public CarLossCar() {
		super();
	}

	public CarLossCar(java.lang.String carId) {
		super();

		this.setCarId(carId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public java.lang.String getCarId() {
		return carId;
	}

	public void setCarId(java.lang.String carId) {
		this.carId = carId;
	}

	public java.lang.String getCarClaimId() {
		return carClaimId;
	}

	public void setCarClaimId(java.lang.String carClaimId) {
		this.carClaimId = carClaimId;
	}

	public java.lang.String getCarShapeId() {
		return carShapeId;
	}

	public void setCarShapeId(java.lang.String carShapeId) {
		this.carShapeId = carShapeId;
	}

	public java.lang.Integer getCarSequence() {
		return carSequence;
	}

	public void setCarSequence(java.lang.Integer carSequence) {
		this.carSequence = carSequence;
	}

	public java.lang.String getSysCreatedBy() {
		return sysCreatedBy;
	}

	public void setSysCreatedBy(java.lang.String sysCreatedBy) {
		this.sysCreatedBy = sysCreatedBy;
	}

	public java.sql.Timestamp getSysCreatedDate() {
		return sysCreatedDate;
	}

	public void setSysCreatedDate(java.sql.Timestamp sysCreatedDate) {
		this.sysCreatedDate = sysCreatedDate;
	}

	public java.lang.String getSysUpdatedBy() {
		return sysUpdatedBy;
	}

	public void setSysUpdatedBy(java.lang.String sysUpdatedBy) {
		this.sysUpdatedBy = sysUpdatedBy;
	}

	public java.sql.Timestamp getSysUpdatedDate() {
		return sysUpdatedDate;
	}

	public void setSysUpdatedDate(java.sql.Timestamp sysUpdatedDate) {
		this.sysUpdatedDate = sysUpdatedDate;
	}

}
