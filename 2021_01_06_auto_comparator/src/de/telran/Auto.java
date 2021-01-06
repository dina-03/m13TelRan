package de.telran;

import java.util.Arrays;
import java.util.Comparator;

//Написать компаратор, который сравнивает объекты типа авто. Авто имеет год, пробег.
// Ценнее автомобиль, имеющий меньший пробег, а затем меньший год
public class Auto {
    private String name;
    private int year;
    private int mileage;

    public Auto(String name, int year, int mileage) {
        this.name = name;
        this.year = year;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public void compareAutoByMileage(Auto[] autos) {
        System.out.println("Best by mileage " + Arrays.stream(autos).min(Comparator.comparing(Auto::getMileage)).get()
                + "by age " + Arrays.stream(autos).max(Comparator.comparing(Auto::getYear)).get());
    }

    @Override
    public String toString() {
        return "auto: " + name +
                ", year: " + year +
                ", mileage: " + mileage + "\n";
    }

}
