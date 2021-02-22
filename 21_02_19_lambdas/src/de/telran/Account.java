package de.telran;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Account {
    private String id;
    private long balance;
    private boolean isLocked;

    public Account(String id, long balance, boolean isLocked) {
        this.id = id;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    public String getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}

