package com.cgi.trips.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.trips.dto.FlightsDTO;
import com.cgi.trips.services.IFlightService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "APIs to peform crud operation on the itinerary")
public class FlightsController {

	private IFlightService flightService;

	@GetMapping("/")
	@ApiOperation(value = "get the itinerary of the flights", response = FlightsDTO.class)
	public FlightsDTO getItinerary() {
		return flightService.getFlightItinerary();
	}

}
