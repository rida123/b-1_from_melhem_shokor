package com.claimsExpress.Esurvey.responses;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import com.claimsExpress.Esurvey.models.CarsAppAccident;

public class CarsAppNotesResponse {
private String  notesId ;
	private String carsAppAccidentId ;
	private String  notesRemark ;
	    private byte[] voiceNote;
		public String getNotesId() {
			return notesId;
		}
		public void setNotesId(String notesId) {
			this.notesId = notesId;
		}
		
		public String getCarsAppAccidentId() {
			return carsAppAccidentId;
		}
		public void setCarsAppAccidentId(String carsAppAccidentId) {
			this.carsAppAccidentId = carsAppAccidentId;
		}
		public String getNotesRemark() {
			return notesRemark;
		}
		public void setNotesRemark(String notesRemark) {
			this.notesRemark = notesRemark;
		}
		public byte[] getVoiceNote() {
			return voiceNote;
		}
		public void setVoiceNote(byte[] voiceNote) {
			this.voiceNote = voiceNote;
		}
	    
}
