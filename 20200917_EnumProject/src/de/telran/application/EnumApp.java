package de.telran.application;

import de.telran.data.DayOfWeek;
import de.telran.data.Schedule;
import de.telran.data.WeekDay;

import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.MONDAY;
        WeekDay weekDay2 = WeekDay.TUESDAY;
        //System.out.println(weekDay);
        DayOfWeek monday = DayOfWeek.MONDAY;
        /*System.out.println(monday);//DayOfWeek: mon
        System.out.println(monday.toString().toLowerCase());//dayofweek
        System.out.println(DayOfWeek.SATURDAY.ordinal());//5
        System.out.println(Arrays.toString(DayOfWeek.values()));//[DayOfWeek: mon, ....]
        System.out.println(monday.getTitle());//mon
        System.out.println(DayOfWeek.SATURDAY.getTitle());//sat
        DayOfWeek.FRIDAY.sayHello();
        monday.sayHello();
        Schedule schedule1 = new Schedule(DayOfWeek.SUNDAY);
        Schedule schedule2 = new Schedule(DayOfWeek.MONDAY);
        schedule1.wakeUp();
        schedule2.wakeUp();
        schedule1.getMenu();
        schedule2.getMenu();*/

        Schedule[] schedules = {new Schedule(DayOfWeek.MONDAY),new Schedule(DayOfWeek.THURSDAY),new Schedule(DayOfWeek.WEDNESDAY)};
        for (Schedule s : schedules) {
            s.getMenu();
        }
    }

}
