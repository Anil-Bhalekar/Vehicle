package com.bla.bla.backend.resp.view;

import java.util.Date;

public class APIResponseView {

	private Object data;
	private Date currentDateTime;
	private int page;
	private int size;
	private int totalRecord;
	private String message;
	private String status;
	private int statusCode;

	public APIResponseView(Object data, String message, String status, int statusCode) {
		super();
		this.data = data;
		this.currentDateTime = new Date();
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
	}

	public APIResponseView(String message, String status, int statusCode) {
		super();
		this.currentDateTime = new Date();
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
	}

	public APIResponseView(Object data, int page, int size, int totalRecord, String message, String status,
			int statusCode) {
		super();
		this.data = data;
		this.currentDateTime = new Date();
		this.page = page;
		this.size = size;
		this.totalRecord = totalRecord;
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Date getCurrentDateTime() {
		return currentDateTime;
	}

	public void setCurrentDateTime(Date currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
