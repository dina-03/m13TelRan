package de.telran;

import de.telran.ran.CharRun;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start Main Thread");
        /*CharThread starThread = new CharThread(20, '*');
        CharThread plusThread = new CharThread(20, '+');

        starThread.start();
        plusThread.start();

        starThread.join();
        plusThread.join();*/

        Runnable minusRun = new CharRun(25,'-');
        Runnable plusRun = new CharRun(25,'+');

        Thread minusTh = new Thread(minusRun);
        Thread plusTh = new Thread(plusRun);

        minusTh.start();
        plusTh.start();

        System.out.println("End of main");
    }
}
