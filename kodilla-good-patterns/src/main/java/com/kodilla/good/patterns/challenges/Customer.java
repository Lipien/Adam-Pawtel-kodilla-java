package com.kodilla.good.patterns.challenges;

public class Customer {
    private String name;
    private String surname;
    private String postalCode;
    private String city;
    private String address;

    public Customer(String name, String surname, String postalCode, String city, String address) {
        this.name = name;
        this.surname = surname;
        this.postalCode = postalCode;
        this.city = city;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}
