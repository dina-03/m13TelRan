package de.telran.application;

import de.telran.data.DaysOfWeek;
import de.telran.data.Schedule;
import de.telran.data.WeekDay;

public class EnumApp {
    public static void main(String[] args) {
        WeekDay weekDay1 = WeekDay.MONDAY;
        WeekDay weekDay2 = WeekDay.TUESDAY;
        WeekDay weekDay3 = WeekDay.WEDNESDAY;
        WeekDay weekDay4 = WeekDay.THURSDAY;
        WeekDay weekDay5 = WeekDay.FRIDAY;
        WeekDay weekDay6 = WeekDay.SATURDAY;
        WeekDay weekDay7 = WeekDay.SUNDAY;

        DaysOfWeek[] weeks = {DaysOfWeek.MONDAY,DaysOfWeek.TUESDAY,DaysOfWeek.WEDNESDAY,DaysOfWeek.THURSDAY,
                DaysOfWeek.FRIDAY,DaysOfWeek.SATURDAY,DaysOfWeek.SUNDAY};
        //System.out.println(weekDay);
       /* DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday);//DayOfWeek: mon
        System.out.println(monday.toString().toLowerCase());//dayofweek
        System.out.println(DayOfWeek.SATURDAY.ordinal());//5
        System.out.println(Arrays.toString(DayOfWeek.values()));//[DayOfWeek: mon, ....]
        System.out.println(monday.getTitle());//mon
        System.out.println(DayOfWeek.SATURDAY.getTitle());//sat
        DayOfWeek.FRIDAY.sayHello();
        monday.sayHello();*/
        /*Schedule schedule1 = new Schedule(DayOfWeek.SUNDAY);
        Schedule schedule2 = new Schedule(DayOfWeek.MONDAY);
        schedule1.wakeUp("mon");
        schedule2.wakeUp("tue");
        schedule1.getMenu();
        schedule2.getMenu();*/


        Schedule schedule = new Schedule(weeks);

        schedule.wakeUp(DaysOfWeek.THURSDAY);
        schedule.wakeUp(DaysOfWeek.FRIDAY);
        schedule.wakeUp(DaysOfWeek.SATURDAY);
        schedule.wakeUp(DaysOfWeek.MONDAY);
        schedule.wakeUp(DaysOfWeek.SUNDAY);
        System.out.println("-----");
        /*Schedule[] schedules = {weeks};
        for (Schedule s : schedules) {
            s.getMenu();
        }*/
        schedule.getMenu();
    }

}
