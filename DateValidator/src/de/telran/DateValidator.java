package de.telran;

public class DateValidator {
    public static boolean dateValidator(int year, int month, int day) {
        return isYearCorrect(year) && isMonthCorrect(month) && isDayCorrect(year, month, day);
    }

    private static boolean isYearCorrect(int year) {
        return year >= 1;
    }

    private static boolean isMonthCorrect(int month) {
        return month <= 12 && month >= 1;
    }

    private static boolean isDayCorrect(int year, int month, int day) {
        if (day >= 1 && day <= 28) {
            return true;
        }
        return day > 28 && day <= getDayPerMonth(month, year);
    }

    private static int getDayPerMonth(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return 28 + addDayIfYearLeap(year);
        }
        return 31;
    }

    private static int addDayIfYearLeap(int year) {
        return isYearLeap(year) ? 1 : 0; // ? if true -> 1, if false -> 0
    }

    private static boolean isYearLeap(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}
