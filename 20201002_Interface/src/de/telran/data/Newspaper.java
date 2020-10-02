package de.telran.data;

public class Newspaper implements Printable {
    private String title;

    public Newspaper(String title) {
        this.title = title;
    }
    public Newspaper() {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public void print2(String str) {
        System.out.println("Newspaper " + str);
    }
}


