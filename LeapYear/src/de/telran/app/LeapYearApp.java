package de.telran.app;

import de.telran.data.LeapYear;

public class LeapYearApp {
    public static void main(String[] args) {
        System.out.println(LeapYear.leapYear(2020, 2, 31));
        System.out.println(LeapYear.leapYear(2020, 2, 29));
        System.out.println(LeapYear.leapYear(2019, 2, 29));
        System.out.println(LeapYear.leapYear(2016, 14, 29));
        System.out.println(LeapYear.leapYear(2016, 12, 30));
        System.out.println(LeapYear.leapYear(2017, 2, 28));
    }
}
