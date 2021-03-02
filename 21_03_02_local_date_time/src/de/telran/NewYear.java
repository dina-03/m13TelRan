package de.telran;

import java.time.LocalDate;
import java.time.Period;

public class NewYear {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate newYear = LocalDate.of(2021, 12, 31);
        Period period = Period.between(now, newYear);
        System.out.println("до нового года осталось " + period.getMonths() + " месяцев и " + period.getDays() + " " +
                "дней");
    }
}
