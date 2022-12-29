package com.claimsExpress.Esurvey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "V_LOSS_CAR2")
@EntityListeners(AuditingEntityListener.class)
public class VLossCar2 {
	@Id
	@Column(name = "CARID")
	private String carId;

	@Column(name = "NOTIFICATIONID")
	private String notificationId;

	@Column(name = "INSCOMPANYID")
	private String insuranceCompanyId;

	@Column(name = "POLCARID")
	private String policyCarId;
	
	@Column(name = "LOSSTOWID")
	private String lossTowId;

	@Column(name = "VEHSEQ")
	private Integer vehSeq;

	@Column(name = "POLICY_HOLDER")
	private String policyHolder;
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
