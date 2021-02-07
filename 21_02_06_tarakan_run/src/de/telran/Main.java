package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Score> cockroaches = new ArrayList<>();

        Cockroach petja = new Cockroach("petja", 15, cockroaches);
        Cockroach vasja = new Cockroach("vasja", 15, cockroaches);
        Cockroach kolja = new Cockroach("kolja", 15, cockroaches);
        Cockroach slava = new Cockroach("slava", 15, cockroaches);
        Cockroach tasha = new Cockroach("tasha", 15, cockroaches);
        Cockroach sonja = new Cockroach("sonja", 15, cockroaches);
        Cockroach shrek = new Cockroach("shrek", 15, cockroaches);

        Thread petjaThread = new Thread(petja);
        Thread vasjaThread = new Thread(vasja);
        Thread koljaThread = new Thread(kolja);
        Thread slavaThread = new Thread(slava);
        Thread tashaThread = new Thread(tasha);
        Thread sonjaThread = new Thread(sonja);
        Thread shrekThread = new Thread(shrek);

        petjaThread.start();
        koljaThread.start();
        vasjaThread.start();
        slavaThread.start();
        tashaThread.start();
        sonjaThread.start();
        shrekThread.start();

        petjaThread.join();
        koljaThread.join();
        vasjaThread.join();
        slavaThread.join();
        tashaThread.join();
        sonjaThread.join();
        shrekThread.join();

        for (Score score : cockroaches) {
            System.out.println(score);
        }
    }
}
