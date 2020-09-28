package de.telran.data;

public class ImplementationDteValidator {
    private int year;
    private int month;
    private int day;

    public ImplementationDteValidator(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean year(int year) {
        if (year > 0) {
            return true;
        }
        return false;
    }

    public boolean month(int month) {
        if (month <= 12 && month > 0) {
            return true;
        }
        return false;
    }

    public boolean daysOne(int day) {
        if ((day <= 31 && month % 2 == 0) || (day <= 30 && month % 2 != 0)) {
            return true;
        }
        return false;
    }

    public boolean daysTow(int day) {
        if ((day <= 30 && month % 2 == 0) || (day <= 31 && month % 2 != 0)) {
            return true;
        }
        return false;
    }

    public boolean leapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public boolean february() {
        if (!leapYear(year) && day <= 28 && month == 2) {
            return true;
        } else if (leapYear(year) && day <= 29 && month == 2) {
            return true;
        }
        return false;
    }

    public boolean date() {
        if (month == 2) {
            return year(year) && february();
        } else if (month < 8) {
            return year(year) && daysOne(day);
        }else {
            return year(year) && month(month) && daysTow(day);
        }
    }
}
