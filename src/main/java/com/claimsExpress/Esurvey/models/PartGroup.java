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
@Table(name="PART_GROUP_LOV_VW")
@EntityListeners(AuditingEntityListener.class)
public class PartGroup  implements Cloneable {

	private static Log logger = LogFactory.getLog(Company.class);

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CODE")
	private java.lang.String code;
	
	@Column(name="DESCRIPTION")
	private java.lang.String description;

	public PartGroup() {
		super();
	}

	public PartGroup(java.lang.String code) {
		super();

		this.setCode(code);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	
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
