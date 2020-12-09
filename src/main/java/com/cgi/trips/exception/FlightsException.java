package com.cgi.trips.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class FlightsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final Error error;

}
