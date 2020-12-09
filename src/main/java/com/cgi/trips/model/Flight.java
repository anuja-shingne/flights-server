package com.cgi.trips.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Flight {

	private List<Itinerary> itineraries;
	private List<Leg> legs;

	public Leg getLegByLegId(String legId) {
		return legs.stream().filter(leg -> legId.equalsIgnoreCase(leg.getId())).findFirst().orElse(null);

	}
}
