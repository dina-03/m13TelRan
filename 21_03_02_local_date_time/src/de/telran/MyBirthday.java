package de.telran;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class MyBirthday {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1900, 2, 15);
        LocalDate localDateBirthday = birthday.withYear(2021);
        LocalDate now = LocalDate.now();
        System.out.println(localDateBirthday);
        System.out.println("Day of week: " + localDateBirthday.getDayOfWeek());
        System.out.println("Day of year: " + localDateBirthday.getDayOfYear());

        System.out.println((localDateBirthday.getDayOfYear() < now.getDayOfYear()) ?
                "мой день рождения раньше сегодня" : "мой день рождения позже сегодня");

        Period period = Period.between(localDateBirthday, now);
        //System.out.println(period);
        System.out.println("на " + period.getDays() + " дней");

    }
}
