package com.globallogic.BookStore.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalHandler {
     @ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErrorInfo> bookNotPresent(BookNotFoundException ex, WebRequest request)
	{
	ErrorInfo errorInfo=new ErrorInfo(LocalDateTime.now(),HttpStatus.BAD_REQUEST,ex.getMsg(),request.getDescription(false));
	return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.BAD_REQUEST);
	}
	
}
