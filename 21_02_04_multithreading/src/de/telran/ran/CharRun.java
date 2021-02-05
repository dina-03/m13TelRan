package de.telran.ran;

public class CharRun implements Runnable {
    final int times;
    final char ch;

    public CharRun(int times, char ch) {
        this.times = times;
        this.ch = ch;
    }

    @Override
    public void run() {
        System.out.println("start charRun");
        for (int i = 0; i < times; i++) {
            System.out.print(ch + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
