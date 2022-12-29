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
@Table(name="PART_DIRECTION_LOV_VW")
@EntityListeners(AuditingEntityListener.class)
public class Direction implements Cloneable {
	@Id
	@Column(name="CODE")
	private java.lang.String code;

	@Column(name="DESCRIPTION")
	private java.lang.String description;

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	


}