package com.epam.training.Andrej_Paulau.classes;

import java.util.Objects;

public class Address {
    private String city;
    private String StreetName;
    private String houseNumber;
    private int flatNumber;

    public Address(){}
    public Address(String city, String streetName, String houseNumber) {
        this.city = city;
        StreetName = streetName;
        this.houseNumber = houseNumber;
    }

    public Address(String city, String streetName, String houseNumber, int flatNumber) {
        this.city = city;
        StreetName = streetName;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return flatNumber == address.flatNumber && city.equals(address.city) && StreetName.equals(address.StreetName) && houseNumber.equals(address.houseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, StreetName, houseNumber, flatNumber);
    }

    @Override
    public java.lang.String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("city=").append(city);
        sb.append(", StreetName=").append(StreetName);
        sb.append(", houseNumber=").append(houseNumber);
        sb.append(", flatNumber=").append(flatNumber);
        sb.append('}');
        return sb.toString();
    }
}
