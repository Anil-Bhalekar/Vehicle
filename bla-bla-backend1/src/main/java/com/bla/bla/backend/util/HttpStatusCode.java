package com.bla.bla.backend.util;

public enum HttpStatusCode {

	DATA_FOUND(801), DATA_NOT_FOUND(802), DATA_SAVED_SUCCCESSFULLY(803), FAILED_TO_SAVE_DATA(804),
	FAILED_TO_DELETE_DATA(805), DATA_DELETED_SUCCCESSFULLY(806);

	public int statusCode;

	public int getSTatusCode() {
		return this.statusCode;
	}

	private HttpStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
