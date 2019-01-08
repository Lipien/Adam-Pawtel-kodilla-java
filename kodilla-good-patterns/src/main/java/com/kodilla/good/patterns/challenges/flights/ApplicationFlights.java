package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class ApplicationFlights {
    public static void main(String[] args) {
        FlightsRepository flightsRepository = new FlightsRepository();

        Set <Flight> fromGdansk = flightsRepository.findFlightsFrom("Gdańsk");
        System.out.println("# possible routes: " + fromGdansk);


        Set <Flight> toWroclaw = flightsRepository.findFlightsTo("Wrocław");
        System.out.println("# possible routes: " + toWroclaw);

        Set <Flight> fromGdanskToWroclawByKrakow = flightsRepository.findIndirectFlightFromTo("Gdańsk", "Kraków", "Wrocław");
        System.out.println("# possible routes: " + fromGdanskToWroclawByKrakow);
    }
}
