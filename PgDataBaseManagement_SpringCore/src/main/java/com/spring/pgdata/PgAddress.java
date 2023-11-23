package com.spring.pgdata;

public class PgAddress {
    private int zipcode;
    private String street,city,state,country;

    public PgAddress(int zipcode, String street, String city, String state, String country) {
        this.zipcode = zipcode;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "PgAddress :- " +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode ;
    }
}
