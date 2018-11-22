package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {

    private Map<String, Boolean> airportsEurope() {
        final Map<String, Boolean> airportsEurope = new HashMap<>();
        airportsEurope.put("Warsaw", true);
        airportsEurope.put("London", true);
        airportsEurope.put("Barcelona", false);
        airportsEurope.put("Rome", false);
        airportsEurope.put("Moscow", true);
        airportsEurope.put("Stockholm", false);
        airportsEurope.put("Lisbon", true);
        return airportsEurope;
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        String city = flight.getArrivalAirport();
        if (airportsEurope().containsKey(city)) {
            return airportsEurope().get(city);
        } else throw new RouteNotFoundException("Flight not available: try another search.");

    }

}
