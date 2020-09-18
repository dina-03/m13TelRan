package de.telran.data;

public enum DaysOfWeek {
    MONDAY("mon"),
    TUESDAY("tue"),
    WEDNESDAY("wed"),
    THURSDAY("thu"),
    FRIDAY("fri"),
    SATURDAY("sat"),
    SUNDAY("sun");

    private String title;

    public String getTitle() {
        return title;
    }

    DaysOfWeek(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
}
