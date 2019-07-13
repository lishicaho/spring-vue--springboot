package com.springboot.download;

import java.io.File;


public class FileVo {
	
	private File file;
	private String fileName;
	public FileVo(File file, String fileName) {
		super();
		this.file = file;
		this.fileName = fileName;
	}
	public FileVo() {
		super();
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	

}
