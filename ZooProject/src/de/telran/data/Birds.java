package de.telran.data;

import java.util.Objects;

public class Birds extends Animals {
    private String habitat;
    private double weight;
    private double wingLength;
    private double bodyLength;

    public Birds(String type, Color color, int age, String habitat, double weight, double wingLength,
                 double bodyLength) {
        super(type, color, age);
        this.habitat = habitat;
        this.weight = weight;
        this.wingLength = wingLength;
        this.bodyLength = bodyLength;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    public double getWingLength() {
        return wingLength;
    }

    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Birds birds = (Birds) o;
        return Double.compare(birds.weight, weight) == 0 &&
                Double.compare(birds.wingLength, wingLength) == 0 &&
                Double.compare(birds.bodyLength, bodyLength) == 0 &&
                habitat.equals(birds.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, weight, wingLength, bodyLength);
    }

    @Override
    public String toString() {
        return "bird: " + super.toString() +
                "habitat: " + habitat + '\n' +
                "weight:" + weight + "kg" +
                ", wingLength: " + wingLength + "m" +
                ", bodyLength: " + bodyLength + "cm";
    }

    public String toStringType() {
        return type;
    }

    public static void displayBirds(Birds[] birds) {
        for (Birds b : birds) {
            System.out.println(b.toStringType());
        }
    }

    public static Animals findTheWidestWingspan(Birds[] birds) {
        Birds widestWingspan = birds[0];
        for (Birds wb : birds) {
            if (wb.getWingLength() > widestWingspan.getWingLength()) {
                widestWingspan = wb;
            }
        }
        return widestWingspan;
    }

    public static void displayTheWidestWingspanBird(Birds[] birds) {
        System.out.println("The widest wingspan of the " + findTheWidestWingspan(birds));
    }

    public static Animals findTheLightestBird(Birds[] birds) {
        Birds lightestBird = birds[0];
        for (Birds br : birds) {
            if (br.getWeight() < lightestBird.getWeight()) {
                lightestBird = br;
            }
        }
        return lightestBird;
    }

    public static void displayLightestBird(Birds[] birds) {
        System.out.println("The lightest " + findTheLightestBird(birds));
    }
}
