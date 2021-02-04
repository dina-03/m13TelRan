package de.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFootballClub {
    public static void main(String[] args) {
        FootballClub australian = new FootballClub("Australian", "SydneyFC", 2);
        FootballClub english = new FootballClub("English", "Chelsea", 5);
        FootballClub spanish = new FootballClub("Spanish", "Athletic", 4);
        FootballClub english2 = new FootballClub("English", "Liverpool", 3);
        FootballClub spanish2 = new FootballClub("Spanish", "Barcelona", 7);
        FootballClub germany = new FootballClub("Germany", "Bayern", 10);
        List<FootballClub> clubs = new ArrayList<>(Arrays.asList(germany, spanish, spanish2, english, english2,
                australian));
        clubs.sort(new ComparatorByCountryAndPoint());
        for (FootballClub club : clubs) {
            System.out.println(club);
        }
    }
}
