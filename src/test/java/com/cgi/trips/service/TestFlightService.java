package com.cgi.trips.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cgi.trips.services.IFlightService;

@ExtendWith(SpringExtension.class)
class TestFlightService {

	@Autowired
	IFlightService flightService;

	@Test
	void testGetFlightItinerary() {
		
	}

}
