package com.cgi.trips.dto;

import java.util.List;

import com.cgi.trips.model.Leg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItineraryDTO {

	private String id;
	private List<Leg> legList;
	private String price;
	private String agent;
	private float agentRating;

}
