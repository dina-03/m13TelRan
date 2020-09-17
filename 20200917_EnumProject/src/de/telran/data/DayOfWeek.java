package de.telran.data;

public enum DayOfWeek {
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

    DayOfWeek(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DayOfWeek: " + title;
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
}
