package de.telran.data;

import java.util.Objects;

public class Raptors extends Animals {
    private String habitat;
    private double weight;
    private double growth;

    public Raptors(String type, Color color, int age, String habitat, double weight, double growth) {
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
        Raptors raptors = (Raptors) o;
        return Double.compare(raptors.weight, weight) == 0 &&
                Double.compare(raptors.growth, growth) == 0 &&
                habitat.equals(raptors.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, weight, growth);
    }

    @Override
    public String toString() {
        return "raptor: " + super.toString() +
                "habitat: " + habitat + '\n' +
                "weight: " + weight + "kg" +
                ", growth: " + growth + "m";
    }

    public String toStringType() {
        return type;
    }

    public static void displayRaptors(Raptors[] raptors) {
        for (Raptors r : raptors) {
            System.out.println(r.toStringType());
        }
    }

    public static Animals findRaptorsLongevity(Raptors[] raptors) {
        Raptors longevityRaptor = raptors[0];
        for (Raptors rap : raptors) {
            if (rap.getAge() > longevityRaptor.getAge()) {
                longevityRaptor = rap;
            }
        }
        return longevityRaptor;
    }

    public static void displayLongevityRaptor(Raptors[] raptors) {
        System.out.println("the longest-living " + findRaptorsLongevity(raptors));
    }
}
