package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given


        Country poland = new Country("Poland", new BigDecimal("100000000"));
        Country germany = new Country("Germany", new BigDecimal("100000000"));
        Country france = new Country("France", new BigDecimal("100000000"));
        Country italy = new Country("Italy", new BigDecimal("100000000"));
        Country canada = new Country("Canada", new BigDecimal("100000000"));
        Country usa = new Country("USA", new BigDecimal("100000000"));
        Country chile = new Country("Chile", new BigDecimal("100000000"));
        Country brazil = new Country("Brazil", new BigDecimal("100000000"));
        Country uruguay = new Country("Uruguay", new BigDecimal("100000000"));
        Country japan = new Country("Japan", new BigDecimal("100000000"));
        Country china = new Country("China", new BigDecimal("100000000"));
        Country vietnam = new Country("Vietnam", new BigDecimal("100000000"));
        Country ivoryCoast = new Country("Ivory Coast", new BigDecimal("100000000"));


        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");
        Continent southAmerica = new Continent("South America");
        Continent africa = new Continent("Africa");

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);
        world.addContinent(southAmerica);
        world.addContinent(africa);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(italy);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(usa);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(uruguay);
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(vietnam);
        africa.addCountry(ivoryCoast);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQty = new BigDecimal ("1300000000");

        //Then
        Assert.assertEquals(peopleQuantity, expectedPeopleQty);

    }
}