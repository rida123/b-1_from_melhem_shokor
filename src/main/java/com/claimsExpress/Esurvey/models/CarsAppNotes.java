package com.claimsExpress.Esurvey.models;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name = "CARS_APP_NOTES")
@EntityListeners(AuditingEntityListener.class)
public class CarsAppNotes {
	
	
	
	@Id
	@Column(name="APP_NOTES_ID ")
	private String  notesId ;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="APP_NOTES_ACCIDENT_ID",nullable=false)
	private CarsAppAccident carsAppAccident ;
	
	
	
	@Column(name="APP_NOTES_REMARKS ")
	private String  notesRemark ;
	
        @Lob
		@Column(name="APP_NOTES_VOICE")
	    private byte[] voiceNote;

		public String getNotesId() {
			return notesId;
		}

		public void setNotesId(String notesId) {
			this.notesId = notesId;
		}

		public CarsAppAccident getCarsAppAccident() {
			return carsAppAccident;
		}

		public void setCarsAppAccident(CarsAppAccident carsAppAccident) {
			this.carsAppAccident = carsAppAccident;
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

		public CarsAppNotes() {
		
		}
        
        
        
}
