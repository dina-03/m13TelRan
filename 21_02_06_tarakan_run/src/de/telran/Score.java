package de.telran;

public class Score {
    String name;
    long score;

    public Score(String name, long score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public long getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", score: " + score;
    }
}
