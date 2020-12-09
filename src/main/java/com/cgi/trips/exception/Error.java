package com.cgi.trips.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Error implements Serializable {


	private static final long serialVersionUID = 1L;

	private final String message;

	private final HttpStatus code;

}
