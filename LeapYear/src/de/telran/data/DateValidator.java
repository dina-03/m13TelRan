package de.telran.data;

public class DateValidator {
    public static boolean dateValidator(int year, int month, int day) {
        if (!isLeapYear(year) && day <= 28 && month == 2){
            return true;
        }else if (isLeapYear(year) && day <= 29 && month == 2){
            return true;
        }else if (day <= 30 && month == 4 || month == 6 || month == 9 || month == 11){
            return true;
        }else if (day <= 31 && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year){
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
