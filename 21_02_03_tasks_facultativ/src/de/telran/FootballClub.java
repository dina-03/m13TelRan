package de.telran;
//расположить команды по странам в алфавитном порядке и количеству набранных очков

public class FootballClub implements Comparable<FootballClub>{
    String country;
    String name;
    int achievedPoint;

    public FootballClub(String country, String name, int achievedPoint) {
        this.country = country;
        this.name = name;
        this.achievedPoint = achievedPoint;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public int getAchievedPoint() {
        return achievedPoint;
    }

    @Override
    public String toString() {
        return "country: " + country +
                ", name: " + name +
                ", achievedPoint: " + achievedPoint;
    }

    @Override
    public int compareTo(FootballClub o) {
        return this.country.compareTo(o.country);
    }
}
