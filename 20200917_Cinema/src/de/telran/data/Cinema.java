package de.telran.data;

import java.util.Objects;

public class Cinema {
    private String name;
    private Address address;

    public Cinema(String name) {
        this.name = name;
    }

    public Cinema(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cinema cinema = (Cinema) o;
        return name.equals(cinema.name) &&
                address.equals(cinema.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Cinema" + name +
                ", address: " + address +
                ';';
    }

    public static boolean isCinemaInArray(String name, Cinema[] cinemas){
        for (Cinema cinema : cinemas) {
            if (cinema.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
