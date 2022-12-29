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
@Table(name="CORE_USER_PREFERENCE")
@EntityListeners(AuditingEntityListener.class)
public class UserPreference implements Cloneable {

	private static Log logger = LogFactory.getLog(UserPreference.class);

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private java.lang.String userId;

	@Column(name="CORE_COMPANY_ID")
	private java.lang.Integer userCompanyId;

	@Column(name="DISPLAY_NAME")
	private java.lang.String userName;
	
	@Column(name="USER_EMAIL")
	private java.lang.String userEmail;

	public UserPreference() {
		super();
	}

	public UserPreference(java.lang.String userId) {
		super();

		this.setUserId(userId);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}



	public java.lang.String getUserId() {
		return userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}

	public java.lang.Integer getUserCompanyId() {
		return userCompanyId;
	}

	public void setUserCompanyId(java.lang.Integer userCompanyId) {
		this.userCompanyId = userCompanyId;
	}

	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(java.lang.String userEmail) {
		this.userEmail = userEmail;
	}



}
