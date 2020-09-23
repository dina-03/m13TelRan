package de.telran.data;

import java.util.Objects;

public class BankAccount {
    private int account;
    private Person client;
    private double balance;
    private static int accountsNumber = 12000010;


    public BankAccount(Person client, double balance) { //BankAccount ba001 = new BankAccount();
        account = ++accountsNumber;
        this.client = client;
        this.balance = balance; // (..., double sum) -> balance = sum

    }

    public int getAccount() {
        return account;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BankAccount account1 = (BankAccount) o;
        return account == account1.account &&
                Double.compare(account1.balance, balance) == 0 &&
                client.equals(account1.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, client, balance);
    }

    @Override
    public String toString() {
        return "BankAccount number: " + account + "\n" + client.toStringName() +
                "\nbalance: " + balance;
    }

    public void debit(double sum) {
        balance = balance + sum;
    }

    public boolean credit(double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }
        return false;
    }
}
