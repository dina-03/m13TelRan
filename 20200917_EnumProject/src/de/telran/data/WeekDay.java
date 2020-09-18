package de.telran.data;

public class WeekDay {
    private String titleOfDay;

    private WeekDay(String titleOfDay){
        this.titleOfDay = titleOfDay;
    }

    public static WeekDay MONDAY = new WeekDay("monday");
    public static WeekDay TUESDAY = new WeekDay("tuesday");
    public static WeekDay WEDNESDAY = new WeekDay("wednesday");
    public static WeekDay THURSDAY = new WeekDay("thursday");
    public static WeekDay FRIDAY = new WeekDay("friday");
    public static WeekDay SATURDAY = new WeekDay("saturday");
    public static WeekDay SUNDAY = new WeekDay("sunday");

    @Override
    public String toString() {
        return "WeekDay: " +
                "titleOfDay: " + titleOfDay +
                ';';
    }
}
