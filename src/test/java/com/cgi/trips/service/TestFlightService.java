package com.cgi.trips.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cgi.trips.dto.FlightsDTO;
import com.cgi.trips.services.IFlightService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TestFlightService {

	@Autowired
	IFlightService flightService;

	@Test
	void testGetFlightItinerary() {

		FlightsDTO flightDto = flightService.getFlightItinerary();
		assertEquals(7, flightDto.getFlight().getItineraries().size());

	}

}
