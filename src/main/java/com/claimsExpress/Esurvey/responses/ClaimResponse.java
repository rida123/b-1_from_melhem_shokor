package com.claimsExpress.Esurvey.responses;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Value;

public interface ClaimResponse {

	@Value("#{target.NOTIFICATION}")
	String getNotification();

	@Value("#{target.NOTIFICATIONID}")
	String getNotificationId();

	@Value("#{target.CLAIMSTATUSCODE}")
	String getClaimStatusCode();

	@Value("#{target.REPORTEDDATE}")
	Timestamp getReportedDate();

	@Value("#{target.INSCOMPANYCODE}")
	String getInsCompanyCode();

}
