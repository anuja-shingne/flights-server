package com.cgi.trips.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cgi.trips.config.Constants;
import com.cgi.trips.dto.FlightDTO;
import com.cgi.trips.dto.ItineraryDTO;
import com.cgi.trips.exception.Error;
import com.cgi.trips.exception.FlightsException;
import com.cgi.trips.model.Flight;
import com.cgi.trips.model.Itinerary;
import com.cgi.trips.model.Leg;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FlightService implements IFlightService {

	@Override
	public FlightDTO getFlightItinerary() {
		File resource;
		FlightDTO flightDto = null;
		Flight flight = null;
		try {
			resource = new ClassPathResource(Constants.FLIGHTS_FILE).getFile();

			ObjectMapper mapper = new ObjectMapper();
			ModelMapper modelMapper = new ModelMapper();

			flight = mapper.readValue(resource, Flight.class);

			List<ItineraryDTO> itineraries = new ArrayList<>();

			flightDto = FlightDTO.builder().build();

			for (Itinerary itinerary : flight.getItineraries()) {
				ItineraryDTO itineraryDto = modelMapper.map(itinerary, ItineraryDTO.class);
				List<Leg> legs = new ArrayList<>();
				for (String legId : itinerary.getLegs()) {
					legs.add(flight.getLegByLegId(legId));
				}
				itineraryDto.setLegList(legs);
				itineraries.add(itineraryDto);
			}

			flightDto.setItineraries(itineraries);

		} catch (IOException e) {
			log.error("Cannot parse flights file!");

			throw new FlightsException(
					Error.builder().code(HttpStatus.INTERNAL_SERVER_ERROR).message(Constants.PARSE_ERROR_MSG).build());
		}

		return flightDto;
	}

}
