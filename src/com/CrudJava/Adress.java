package com.CrudJava;

public class Adress {
    private String city;
    private int streetNumber;
    private String street;

    public Adress(String city, int streetNumber, String street) {
        this.city = city;
        this.streetNumber = streetNumber;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
