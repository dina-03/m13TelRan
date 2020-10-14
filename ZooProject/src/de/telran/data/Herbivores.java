package de.telran.data;

import java.util.Objects;

public class Herbivores extends Animals {
    private String habitat;
    private double weight;
    private double growth;

    public Herbivores(String type, Color color, int age, String habitat, double weight, double growth) {
        super(type, color, age);
        this.habitat = habitat;
        this.weight = weight;
        this.growth = growth;
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

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Herbivores that = (Herbivores) o;
        return Double.compare(that.weight, weight) == 0 &&
                Double.compare(that.growth, growth) == 0 &&
                habitat.equals(that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, weight, growth);
    }

    @Override
    public String toString() {
        return "herbivore: " + super.toString() +
                "habitat: " + habitat + '\n' +
                "weight: " + weight + "kg" +
                ", growth: " + growth + "m";
    }

    public static Animals findHerbivoresByWeight(Herbivores[] herbivores) {
        Herbivores heaviest = herbivores[0];
        for (Herbivores h : herbivores) {
            if (h.getWeight() > heaviest.getWeight()) {
                heaviest = h;
            }
        }
        return heaviest;
    }

    public String toStringType() {
        return type;
    }

    public static void displayHerbivores(Herbivores[] herbivores) {
        for (Herbivores h : herbivores) {
            System.out.println(h.toStringType());
        }
    }
}
