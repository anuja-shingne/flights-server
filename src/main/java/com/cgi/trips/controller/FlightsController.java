package com.cgi.trips.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.trips.dto.FlightDTO;
import com.cgi.trips.dto.FlightsDTO;
import com.cgi.trips.services.IFlightService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "APIs to peform crud operation on the itinerary")
@CrossOrigin
public class FlightsController {

	@Autowired
	private IFlightService flightService;

	@GetMapping("/trips")
	@ApiOperation(value = "get the itinerary of the flights", response = FlightsDTO.class)
	public FlightDTO getItinerary() {
		return flightService.getFlightItinerary();
	}

}
