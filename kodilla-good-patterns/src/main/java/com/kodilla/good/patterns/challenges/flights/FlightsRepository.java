package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightsRepository {
    private final Set <Flight> flightConnections = new HashSet <>();

    public FlightsRepository() {
        flightConnections.add(new Flight("Gdańsk", LocalTime.of(8, 00), "Wrocław", LocalTime.of(9, 05)));
        flightConnections.add(new Flight("Gdańsk", LocalTime.of(12, 00), "Wrocław", LocalTime.of(13, 05)));
        flightConnections.add(new Flight("Gdańsk", LocalTime.of(17, 00), "Wrocław", LocalTime.of(18, 05)));
        flightConnections.add(new Flight("Gdańsk", LocalTime.of(10, 00), "Kraków", LocalTime.of(11, 00)));
        flightConnections.add(new Flight("Kraków", LocalTime.of(11, 30), "Wrocław", LocalTime.of(12, 15)));
        flightConnections.add(new Flight("Gdańsk", LocalTime.of(20, 00), "Kraków", LocalTime.of(21, 00)));
        flightConnections.add(new Flight("Kraków", LocalTime.of(21, 15), "Wrocław", LocalTime.of(22, 30)));
        flightConnections.add(new Flight("Poznań", LocalTime.of(21, 15), "Warszawa", LocalTime.of(22, 30)));
        flightConnections.add(new Flight("Katowice", LocalTime.of(21, 15), "Rzeszów", LocalTime.of(22, 30)));
        flightConnections.add(new Flight("Szczecin", LocalTime.of(21, 15), "Warszawa", LocalTime.of(22, 30)));

    }


    public Set <Flight> getFlightConnections() {
        return new HashSet <>(flightConnections);
    }

    public Set <Flight> findIndirectFlightFromTo(String fromCity, String byCity, String toCity) {

        Flight flightFrom = flightConnections.stream()
                .filter(f -> f.getCityOfDeparture().equals(fromCity))
                .filter(f -> f.getCityOfArrival().equals(byCity))
                .findFirst().get();

        Flight flightTo = flightConnections.stream()
                .filter(f -> f.getCityOfDeparture().equals(byCity))
                .filter(f -> f.getCityOfArrival().equals(toCity))
                .findFirst().get();

        HashSet <Flight> indirectFlights = new HashSet <>();
        indirectFlights.add(flightFrom);
        indirectFlights.add(flightTo);

        return indirectFlights;
    }

    public Set <Flight> findFlightsFrom(String fromCity) {
        return flightConnections.stream()
                .filter(f -> f.getCityOfDeparture().equals(fromCity))
                .collect(Collectors.toSet());
    }

    public Set <Flight> findFlightsTo(String toCity) {
        return flightConnections.stream()
                .filter(f -> f.getCityOfArrival().equals(toCity))
                .collect(Collectors.toSet());
    }
}
