package de.telran.data;

public class Address {
    private String street;
    private int houseNumber;

    public String getStreet() {
        return street;
    }

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address: " +
                "street: " + street + '\'' +
                ", houseNumber=" + houseNumber ;
    }
}
