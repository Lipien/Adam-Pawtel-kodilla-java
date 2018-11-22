package com.kodilla.exception.test;

public class RouteNotFoundExceptionHandling {
    public static void main(String[] args) {
        FlightScanner searchResult = new FlightScanner();

        try {
            searchResult.findFlight(new Flight("Warsaw", "Moscow"));
        } catch (RouteNotFoundException e) {
            System.out.println("We can't find chosen flight. Try other connection.");
        }
        System.out.println("LOT: discover Europe!");
    }
}
