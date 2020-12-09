package com.cgi.trips.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class FlightsExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(FlightsException.class)
	public ResponseEntity<Error> handleException(FlightsException ex) {
		return new ResponseEntity<>(ex.getError(), ex.getError().getCode());
	}

}
