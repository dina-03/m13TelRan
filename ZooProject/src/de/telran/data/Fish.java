package de.telran.data;

import java.util.Objects;

public class Fish extends Animals {
    private String habitat;
    private double weight;
    private double length;

    public Fish(String type, Color color, int age, String habitat, double weight, double length) {
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
        Fish fish = (Fish) o;
        return Double.compare(fish.weight, weight) == 0 &&
                Double.compare(fish.length, length) == 0 &&
                habitat.equals(fish.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, weight, length);
    }

    @Override
    public String toString() {
        return "fish: " + super.toString() +
                "habitat: " + habitat + '\n' +
                "weight: " + weight + "kg" +
                ", bodyLength: " + length + "cm";
    }

    public String toStringType() {
        return type;
    }

    public static void displayFish(Fish[] fish) {
        for (Fish f : fish) {
            System.out.println(f.toStringType());
        }
    }

}
