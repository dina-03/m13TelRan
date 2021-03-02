package de.telran;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        // LocalDate
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate tomorrow = now.plus(Period.ofDays(1));
        System.out.println(tomorrow);
        tomorrow = now.plusDays(1);
        tomorrow = now.plus(1, ChronoUnit.DAYS);
        System.out.println(tomorrow);
        System.out.println("Today is: " + now.getDayOfWeek() + " day of week");
        System.out.println("Today is: " + now.getDayOfYear() + " day of year");
        //isAfter/isBefore
        System.out.println(now.isAfter(tomorrow));

        System.out.println(System.currentTimeMillis());
        System.out.println(now.toEpochSecond(LocalTime.now(), ZoneOffset.ofHours(2)));

        //LocalTime
        LocalTime currentTime = LocalTime.now();
        LocalTime nextHour = currentTime.plus(Duration.ofHours(1));
        System.out.println(nextHour);
        nextHour = currentTime.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour);
        nextHour = currentTime.plusHours(1);
        System.out.println(nextHour);
        System.out.println(currentTime.isBefore(nextHour));

        //LocalDateTime
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime parsed = LocalDateTime.parse("2021-03-02T12:25:59");
        System.out.println(today);
        System.out.println(parsed);
        System.out.println(parsed.get(ChronoField.DAY_OF_YEAR));

        LocalDateTime fromDateAndTime = LocalDateTime.of(now, currentTime);
        LocalDateTime.of(1999, 02, 15, 15, 00);
        System.out.println(fromDateAndTime);

        //with
        LocalDateTime yearAgo = today.with(ChronoField.YEAR, 2020);
        System.out.println(yearAgo);

        //ZonedDateTime
        System.out.println(ZoneId.getAvailableZoneIds());

        ZonedDateTime minskMorning = ZonedDateTime.of(
                LocalDateTime.of(2021, Month.MARCH, 4, 6, 0),
                ZoneId.of("Europe/Minsk")
        );
        System.out.println(minskMorning);

        ZonedDateTime moscowMorning = minskMorning.withZoneSameInstant(ZoneId.of("Asia/Vladivostok"));//IMPORTANTE
        System.out.println(moscowMorning);

        ZonedDateTime sameTimeOtherZone = minskMorning.withZoneSameLocal(ZoneId.of("Asia/Vladivostok"));
        System.out.println(sameTimeOtherZone);

        //Differences between times/dates etc
        LocalDate plusHalfYear = now.plus(16, ChronoUnit.MONTHS);
        Period period = Period.between(tomorrow, plusHalfYear);
        System.out.println("days: " + period.getDays());
        System.out.println("months: " + period.getMonths());
        System.out.println("years: " + period.getYears());

        int numberDaysBetweenTomorrowAndPlusYear = (int) ChronoUnit.DAYS.between(tomorrow, plusHalfYear);
        System.out.println(numberDaysBetweenTomorrowAndPlusYear);

        //for time
        Duration duration = Duration.between(currentTime, nextHour);
        System.out.println(duration);
        System.out.println(ChronoUnit.MINUTES.between(nextHour, currentTime)); // -60
        System.out.println(ChronoUnit.HOURS.between(currentTime, nextHour));

        // Formatting
        LocalDateTime fromStandardString = LocalDateTime.parse("2021-03-02T12:25:59");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("formatter print: " + today.format(formatter));
        LocalDate fromPattern = LocalDate.parse("2021/03/02", formatter);
        System.out.println(fromPattern.toString());
        System.out.println(fromPattern.format(formatter));

        System.out.println("..........................");

        ZonedDateTime almatyMorning = ZonedDateTime.of(
                LocalDateTime.of(2021, Month.MARCH, 2, 3, 0),
                ZoneId.of("Asia/Almaty"));
        System.out.println("almaty: " + almatyMorning);
    }
}
