package de.telran;

import java.util.List;

public class Cockroach implements Runnable {
    private final String name;
    private final int distance;
    final List<Score> scoreList;
    private long startingTime;

    public Cockroach(String name, int distance, List<Score> scoreList) {
        this.name = name;
        this.distance = distance;
        this.scoreList = scoreList;
        this.startingTime = 0;
    }

    @Override
    public void run() {
        long sleepTime = (long) (Math.random() * 50 + 50);
        for (int i = 0; i < distance; i++) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long res = System.currentTimeMillis() - startingTime;
        scoreList.add(new Score(name, res));
    }
}
