package de.telran.data;

import java.util.Arrays;

public class Schedule {
    private DaysOfWeek[] week;

    public Schedule(DaysOfWeek[] week) {
        this.week = week;
    }

    public DaysOfWeek[] getWeek() {
        return week;
    }

    public void setWeek(DaysOfWeek[] week) {
        this.week = week;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Schedule schedule = (Schedule) o;
        return Arrays.equals(week, schedule.week);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(week);
    }

    public void wakeUp(DaysOfWeek days) {
        if (week[days.ordinal()].ordinal() > 4) {
            System.out.println(days + ", " + "you can sleep longer");
        } else {
            System.out.println(days + ", " + "wake up!");
        }
    }

    public void getMenu() {
        for (DaysOfWeek days : week) {
            if (days.equals(DaysOfWeek.MONDAY)) {
                System.out.println(DaysOfWeek.MONDAY.getTitle() + ":" + " Spaghetti");
            }
            if (days.equals(DaysOfWeek.TUESDAY)) {
                System.out.println(DaysOfWeek.TUESDAY.getTitle() + ":" + " Pizza");
            }
            if (days.equals(DaysOfWeek.WEDNESDAY)) {
                System.out.println(DaysOfWeek.WEDNESDAY.getTitle() + ":" + " Chicken");
            }
            if (days.equals(DaysOfWeek.THURSDAY)) {
                System.out.println(DaysOfWeek.THURSDAY.getTitle() + ":" + " Fish");
            }
            if (days.equals(DaysOfWeek.FRIDAY)) {
                System.out.println(DaysOfWeek.FRIDAY.getTitle() + ":" + " Soup");
            }
            if (days.equals(DaysOfWeek.SATURDAY)) {
                System.out.println(DaysOfWeek.SATURDAY.getTitle() + ":" + " Olivie");
            }
            if (days.equals(DaysOfWeek.SUNDAY))
                System.out.println(DaysOfWeek.SUNDAY.getTitle() + ":" + " Borsch");
        }
    }

   /* public void getMenu(){
        switch (Arrays.toString(week)){
            case "MONDAY":
                System.out.println("Spaghetti");
                break;
            case "TUESDAY":
                System.out.println("Pizza");
                break;
            case "WEDNESDAY":
                System.out.println("Chicken");
                break;
            case "THURSDAY":
                System.out.println("Fish");
                break;
            case "FRIDAY":
                System.out.println("Soup");
                break;
            case "SATURDAY":
                System.out.println("Olivie");
                break;
            case "SUNDAY":
                System.out.println("Borsch");
                break;
        }
    }*/
}
