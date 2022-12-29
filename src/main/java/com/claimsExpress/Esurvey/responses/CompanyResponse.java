package com.claimsExpress.Esurvey.responses;

import java.io.Serializable;

public class CompanyResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer companyId;

	private String companyName;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
