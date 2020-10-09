package de.telran;

import org.junit.Test;

public class TrackingService {
    private HistoryItem[] history;
    private int numberHistory = 0;
    private int total;
    private int goal;

    public TrackingService(int historyCapacity) {
        history = new HistoryItem[historyCapacity];
    }

    public HistoryItem[] getHistory() {
        return history;
    }

    public int getTotal() {
        return total;
    }

    public int getNumberHistory() {
        return numberHistory;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    public void addCalories(int amount) {
        total += amount;
        history[numberHistory] = new HistoryItem(amount, "add", ++numberHistory, total);
    }

    public void removeCalorie(int amount) {
        total -= amount;
        if (total < 0)
            total = 0;
        history[numberHistory] = new HistoryItem(amount, "remove", ++numberHistory, total);
    }

    public void displayHistory() {
        for (int i = 0; i < numberHistory; i++) {
            System.out.println(history[i]);
        }
    }

    public boolean isGoalMeet() {
        return total <= goal;
    }
}
