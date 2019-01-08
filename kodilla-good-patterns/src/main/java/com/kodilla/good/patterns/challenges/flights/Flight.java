package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalTime;

public class Flight {
    private String cityOfDeparture;
    private LocalTime departureTime;
    private String cityOfArrival;
    private LocalTime arrivalTime;

    public Flight(String cityOfDeparture, LocalTime departureTime, String cityOfArrival, LocalTime arrivalTime) {
        this.cityOfDeparture = cityOfDeparture;
        this.departureTime = departureTime;
        this.cityOfArrival = cityOfArrival;
        this.arrivalTime = arrivalTime;
    }

    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!getCityOfDeparture().equals(flight.getCityOfDeparture())) return false;
        if (!getDepartureTime().equals(flight.getDepartureTime())) return false;
        if (!getCityOfArrival().equals(flight.getCityOfArrival())) return false;
        return getArrivalTime().equals(flight.getArrivalTime());
    }

    @Override
    public int hashCode() {
        int result = getCityOfDeparture().hashCode();
        result = 31 * result + getCityOfArrival().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "cityOfDeparture='" + cityOfDeparture + '\'' +
                ", departureTime=" + departureTime +
                ", cityOfArrival='" + cityOfArrival + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
