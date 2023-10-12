package com.globallogic.Exceptions;

public class StudentNotPresent extends RuntimeException {
String msg;

public StudentNotPresent(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

}
