package de.telran.data;

public class Auto {
    private String carBrand;
    private int year;
    private String bodyColor;
    private String body;
    private String model;
    private int nrOfDoors;
    private String countryVersion;
    private double price;

    public Auto(){};

    public Auto(String carBrand, int year, String body, String model, int nrOfDoors, String countryVersion){
        this.carBrand = carBrand;
        this.year = year;
        this.body = body;
        this.model = model;
        this.nrOfDoors = nrOfDoors;
        this.countryVersion = countryVersion;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getYear() {
        return year;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getBody() {
        return body;
    }

    public String getModel() {
        return model;
    }

    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public String getCountryVersion() {
        return countryVersion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto:" + carBrand +
                ", year:" + year +
                ", bodyColor:" + bodyColor +
                ", body:" + body +
                ", model:" + model +
                ", nrOfDoors:" + nrOfDoors +
                ", countryVersion:" + countryVersion +
                ", price:" + price + " €" +
                '.';
    }
}
