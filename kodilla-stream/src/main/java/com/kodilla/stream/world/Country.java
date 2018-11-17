package com.kodilla.stream.world;

import java.math.BigDecimal;


public final class Country {
    private final String countryName;
    private final BigDecimal peopleQty;

    public Country(final String countryName, final BigDecimal peopleQty) {
        this.countryName = countryName;
        this.peopleQty = peopleQty;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQty() {
        return peopleQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!getCountryName().equals(country.getCountryName())) return false;
        return getPeopleQty().equals(country.getPeopleQty());
    }

    @Override
    public int hashCode() {
        int result = getCountryName().hashCode();
        result = 31 * result + getPeopleQty().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Country{" + "countryName='" + countryName + '\'' + ", peopleQty=" + peopleQty + '}';
    }


}
