package com.globallogic.BookStore.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorInfo {
	private LocalDateTime timestamp;
	private HttpStatus httpStatus;
	private String message;
	private String path;
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorInfo(LocalDateTime timestamp, HttpStatus httpStatus, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.httpStatus = httpStatus;
		this.message = message;
		this.path = path;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "ErrorInfo [timestamp=" + timestamp + ", httpStatus=" + httpStatus + ", message=" + message + ", path="
				+ path + "]";
	}
	
}
