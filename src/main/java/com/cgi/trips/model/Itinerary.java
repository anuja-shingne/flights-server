package com.cgi.trips.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Itinerary {
	private String id;
	private List<String> legs;
	private List<Leg> legList;
	private String price;
	private String agent;

	@JsonAlias("agent_rating")
	private float agentRating;

}
