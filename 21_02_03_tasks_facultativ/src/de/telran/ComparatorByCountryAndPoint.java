package de.telran;

import java.util.Comparator;

public class ComparatorByCountryAndPoint implements Comparator<FootballClub> {
    @Override
    public int compare(FootballClub o1, FootballClub o2) {
        int res = o1.getCountry().compareTo(o2.getCountry());
        if (res == 0){
            res = Integer.compare(o1.getAchievedPoint(), o2.getAchievedPoint());
        }
        return res;
    }
}
