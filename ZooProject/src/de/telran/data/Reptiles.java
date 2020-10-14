package de.telran.data;

import java.util.Objects;

public class Reptiles extends Animals {
    private String habitat;
    private double weight;
    private double length;

    public Reptiles(String type, Color color, int age, String habitat, double weight, double length) {
        super(type, color, age);
        this.habitat = habitat;
        this.weight = weight;
        this.length = length;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reptiles reptiles = (Reptiles) o;
        return Double.compare(reptiles.weight, weight) == 0 &&
                Double.compare(reptiles.length, length) == 0 &&
                habitat.equals(reptiles.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, weight, length);
    }

    public String toStringType() {
        return type;
    }

    @Override
    public String toString() {
        return "reptile: " + super.toString() +
                "habitat: " + habitat + '\n' +
                "weight: " + weight + "kg " +
                ", bodyLength: " + length + "cm";
    }

    public static void displayReptile(Reptiles[] reptiles) {
        for (Reptiles r : reptiles) {
            System.out.println(r.toStringType());
        }
    }

    public static Animals findReptileLongevity(Reptiles[] reptiles) {
        Reptiles longevity = reptiles[0];
        for (Reptiles reptile : reptiles) {
            if (reptile.getAge() > longevity.getAge()) {
                longevity = reptile;
            }
        }
        return longevity;
    }

    public static void displayReptileLongevity(Reptiles[] reptiles) {
        System.out.println("The longest-living " + findReptileLongevity(reptiles));
    }

    public static Animals findReptileByLength(Reptiles[] reptiles) {
        Reptiles longestReptile = reptiles[0];
        for (Reptiles r : reptiles) {
            if (r.getLength() > longestReptile.getLength()) {
                longestReptile = r;
            }
        }
        return longestReptile;
    }

    public static void displayLongestReptile(Reptiles[] reptiles) {
        System.out.println("Longest " + findReptileByLength(reptiles));
    }
}
