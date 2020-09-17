package de.telran.data;

public class WeekDay {
    private String titleOfDay;

    private WeekDay(String titleOfDay){
        this.titleOfDay = titleOfDay;
    }

    public static WeekDay MONDAY = new WeekDay("monday");
    public static WeekDay TUESDAY = new WeekDay("tuesday");
    public static WeekDay SUNDAY = new WeekDay("sunday");

    @Override
    public String toString() {
        return "WeekDay: " +
                "titleOfDay: " + titleOfDay +
                ';';
    }
}
