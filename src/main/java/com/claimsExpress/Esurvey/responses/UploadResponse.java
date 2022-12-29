package com.claimsExpress.Esurvey.responses;

import java.io.File;

public class UploadResponse {
	
	private java.lang.String notification;
	
	private java.lang.String fileType;

	private  File  file;

	public java.lang.String getNotification() {
		return notification;
	}

	public void setNotification(java.lang.String notification) {
		this.notification = notification;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public java.lang.String getFileType() {
		return fileType;
	}

	public void setFileType(java.lang.String fileType) {
		this.fileType = fileType;
	}

}
