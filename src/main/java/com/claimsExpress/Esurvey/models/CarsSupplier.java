package com.claimsExpress.Esurvey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.claimsExpress.Esurvey.security.AppUser;

@Entity
@Table(name="CARS_SUPPLIER")
@EntityListeners(AuditingEntityListener.class)
public class CarsSupplier {

	@Id
	@Column(name="SUPPLIER_ID")
	private java.lang.String carSupkey;
	@Column(name="SUPPLIER_CORE_USER_ID" )
	private String supplierCoreUserId;
	public java.lang.String getCarSupkey() {
		return carSupkey;
	}
	public void setCarSupkey(java.lang.String carSupkey) {
		this.carSupkey = carSupkey;
	}
	public String getSupplierCoreUserId() {
		return supplierCoreUserId;
	}
	public void setSupplierCoreUserId(String supplierCoreUserId) {
		this.supplierCoreUserId = supplierCoreUserId;
	}
	
}
