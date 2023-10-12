package com.globallogic.Exceptions;

public class NameException extends RuntimeException{
	private String msg;

	public NameException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	

}
