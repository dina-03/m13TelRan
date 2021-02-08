package de.telran;

import java.util.List;
import java.util.Random;

public class Cockroach implements Runnable {
    private final String name;
    private final int distance;
    final List<Score> scoreList;
    private final long startingTime;
    private final Random random = new Random();

    public Cockroach(String name, int distance, List<Score> scoreList) {
        this.name = name;
        this.distance = distance;
        this.scoreList = scoreList;
        this.startingTime = 0;
    }

    @Override
    public void run() {
        //  long sleepTime = (long) (Math.random() * 50 + 50);
        int runningTime = random.nextInt(5) + 50;
        for (int i = 0; i < distance; i++) {
            try {
                Thread.sleep(runningTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long res = System.currentTimeMillis() - startingTime;
        synchronized (scoreList) {
            scoreList.add(new Score(name, res));
        }
    }
}
