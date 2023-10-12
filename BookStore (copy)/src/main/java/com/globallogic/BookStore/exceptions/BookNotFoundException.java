package com.globallogic.BookStore.exceptions;

public class BookNotFoundException extends RuntimeException{
String msg;

public BookNotFoundException(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

}
