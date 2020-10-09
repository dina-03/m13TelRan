package de.telran;

import java.util.Objects;

public class HistoryItem {
    private int amount;
    private String operation;
    private int id;
    private int total;

    public HistoryItem(int amount, String operation, int id, int total) {
        this.amount = amount;
        this.operation = operation;
        this.id = id;
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        HistoryItem that = (HistoryItem) o;
        return amount == that.amount &&
                id == that.id &&
                total == that.total &&
                operation.equals(that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, operation, id, total);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", operation: " + operation +
                ", amount: " + amount +
                ", total calorie: " + total;
    }
}
