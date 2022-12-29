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
@Table(name="CARS_PARTS")
@EntityListeners(AuditingEntityListener.class)
public class CarsParts implements Cloneable {

	private static Log logger = LogFactory.getLog(CarsParts.class);

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PART_ID")
	private java.lang.String partId;
	
	@Column(name="PART_DESCRIPTION")
	private java.lang.String partDescription;

	@Column(name="PART_ARABIC_DESC")
	private java.lang.String partArabicDescription;

	@Column(name="PART_TYPE")
	private java.lang.String partType;

	@Column(name="PART_REPAIR")
	private java.lang.String partRepair;

	@Column(name="PART_MOST_COMMUNLY_USED")
	private java.lang.Integer partMostCommunlyUsed;

	@Column(name="PART_GROUP_CODE")
	private java.lang.String partGroupCode;

	@Column(name="PART_SUBGROUP")
	private java.lang.String partSubGroup;

	@Column(name="PART_DIRECTION")
	private java.lang.String partDirection;

	@Column(name="PART_CODE")
	private java.lang.String partCode;

	@Column(name="PART_COMBINATION")
	private java.lang.String partCombination;

	@Column(name="PART_MET")
	private java.lang.String partMet;

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

	@Column(name="PART_OPINION_MANUAL")
	private java.lang.String partOpinionManual;

	@Column(name="PART_ORDER")
	private java.lang.Integer partOrder;

	public CarsParts() {
		super();
	}

	public CarsParts(java.lang.String partId) {
		super();

		this.setPartId(partId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public java.lang.String getPartId() {
		return partId;
	}

	public void setPartId(java.lang.String partId) {
		this.partId = partId;
	}

	public java.lang.String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(java.lang.String partDescription) {
		this.partDescription = partDescription;
	}

	public java.lang.String getPartArabicDescription() {
		return partArabicDescription;
	}

	public void setPartArabicDescription(java.lang.String partArabicDescription) {
		this.partArabicDescription = partArabicDescription;
	}

	public java.lang.String getPartType() {
		return partType;
	}

	public void setPartType(java.lang.String partType) {
		this.partType = partType;
	}

	public java.lang.String getPartRepair() {
		return partRepair;
	}

	public void setPartRepair(java.lang.String partRepair) {
		this.partRepair = partRepair;
	}

	public java.lang.String getPartGroupCode() {
		return partGroupCode;
	}

	public void setPartGroupCode(java.lang.String partGroupCode) {
		this.partGroupCode = partGroupCode;
	}

	public java.lang.String getPartSubGroup() {
		return partSubGroup;
	}

	public void setPartSubGroup(java.lang.String partSubGroup) {
		this.partSubGroup = partSubGroup;
	}

	public java.lang.String getPartDirection() {
		return partDirection;
	}

	public void setPartDirection(java.lang.String partDirection) {
		this.partDirection = partDirection;
	}

	public java.lang.String getPartCode() {
		return partCode;
	}

	public void setPartCode(java.lang.String partCode) {
		this.partCode = partCode;
	}

	public java.lang.String getPartCombination() {
		return partCombination;
	}

	public void setPartCombination(java.lang.String partCombination) {
		this.partCombination = partCombination;
	}

	public java.lang.String getPartMet() {
		return partMet;
	}

	public void setPartMet(java.lang.String partMet) {
		this.partMet = partMet;
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

	public java.lang.String getPartOpinionManual() {
		return partOpinionManual;
	}

	public void setPartOpinionManual(java.lang.String partOpinionManual) {
		this.partOpinionManual = partOpinionManual;
	}

	public java.lang.Integer getPartMostCommunlyUsed() {
		return partMostCommunlyUsed;
	}

	public void setPartMostCommunlyUsed(java.lang.Integer partMostCommunlyUsed) {
		this.partMostCommunlyUsed = partMostCommunlyUsed;
	}

	public java.lang.Integer getPartOrder() {
		return partOrder;
	}

	public void setPartOrder(java.lang.Integer partOrder) {
		this.partOrder = partOrder;
	}

}
