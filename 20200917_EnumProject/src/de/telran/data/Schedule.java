package de.telran.data;

public class Schedule {
    private DayOfWeek dayOfWeek;
    private DayOfWeek[] week;

    public Schedule(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        //this.week = DayOfWeek.values();
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void wakeUp() {
        if (getDayOfWeek() == DayOfWeek.SATURDAY || getDayOfWeek() == DayOfWeek.SUNDAY) {
            //if (dayOfWeek.ordinal() > 4)
            System.out.println("you can sleep longer");
        } else {
            System.out.println("wake up!");
        }
    }

    public void getMenu(){
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Spaghetti");
                break;
            case TUESDAY:
                System.out.println("Pizza");
                break;
            case WEDNESDAY:
                System.out.println("Chicken");
                break;
            case THURSDAY:
                System.out.println("Fish");
                break;
            case FRIDAY:
                System.out.println("Soup");
                break;
            case SATURDAY:
                System.out.println("Olivie");
                break;
            case SUNDAY:
                System.out.println("Borsch");
                break;
        }
    }
}
