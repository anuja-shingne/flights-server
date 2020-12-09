package com.cgi.trips.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Leg {

	private String id;

	@JsonAlias("departure_airport")
	private String departureAirport;

	@JsonAlias("arrival_airport")
	private String arrivalAirport;

	@JsonAlias("departure_time")
	private Date departureTime;

	@JsonAlias("arrival_time")
	private Date arrivalTime;

	private int stops;

	@JsonAlias("airline_name")
	private String airlineName;

	@JsonAlias("airline_id")
	private String airlineId;

	@JsonAlias("duration_mins")
	private int durationMins;

}
