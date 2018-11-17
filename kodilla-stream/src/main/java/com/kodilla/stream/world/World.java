package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;


public final class World {
    private final Set<Continent> listOfContinents = new HashSet<>();

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQtyOnTheWorld = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent()
                .stream()).distinct()
                .map(Country::getPeopleQty)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return peopleQtyOnTheWorld;


    }

}
