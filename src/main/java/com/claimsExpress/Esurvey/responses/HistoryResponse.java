package com.claimsExpress.Esurvey.responses;
import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Value;

public interface HistoryResponse {


	@Value("#{target.VISA}")
	String getNotification();
	@Value("#{target.SURVEY_DATE}")
	Timestamp getSurveyDate();

	
}
