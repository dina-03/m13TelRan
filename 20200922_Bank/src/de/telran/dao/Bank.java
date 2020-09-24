package de.telran.dao;

import de.telran.data.BankAccount;
import de.telran.data.Person;
import de.telran.data.Sex;

public class Bank {
    private BankAccount[] accounts;
    private int size; //переменная которая следить за счетом банка
    // private Sex sex;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity]; //место на полочках
        size = 0; //сколько на полочку положено
        // this.sex = sex;
    }

    /*public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }*/

    public int getSize() {
        return size;
    }

    public int checkAccount(int account) {
        for (int i = 0; i < size; i++) {
            if (account == accounts[i].getAccount()) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAccount(BankAccount account) {
        if (checkAccount(account.getAccount()) >= 0 || size >= accounts.length) {
            return false;
        }
        accounts[size] = account;
        size++;
        return true;
    }

    public boolean closeAccount(int account) {
        int index = checkAccount(account);
        if (index < 0) {
            return false;
        }
        accounts[index] = accounts[size - 1];
        size--;
        return true;
    }

    public void displayAccount() {
        for (int i = 0; i < size; i++) {
            System.out.println(accounts[i]);
            System.out.println("-.-.-.-.-.-.-");
        }
    }
    public Person[] getClientsPerSex(Sex sex) {
        Person[] clientPerSex = new Person[getCountsClientsPerSex(sex)];
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (accounts[i].getClient().getSex().equals(sex)){
                clientPerSex[newIndex] = accounts[i].getClient();
                newIndex++;
            }
        }
        return clientPerSex;
    }

   /* public String[] getClientsPerSex() {
        String[] clientPerSex = new String[size];
        for (int i = 0; i < size; i++) {
            if (accounts[i].getClient().getSex().equals(Sex.FEMALE)) {
                clientPerSex[i] = accounts[i].getClient().toStringSex();
            } else if (accounts[i].getClient().getSex().equals(Sex.MALE)) {
                clientPerSex[i] = accounts[i].getClient().toStringSex();
            }
        }
        return clientPerSex;
    }*/

    public void displayClientsPerSex(Sex sex) {
        for (int i = 0; i < size; i++) {
            if (accounts[i].getClient().getSex().equals(sex)) {
                System.out.println(accounts[i].getClient());
            }
        }
    }

    public int getCountsClientsPerSex(Sex sex) {
        int count = 0;
       /* for (BankAccount account : getExistingAccount()) {
            if (account.getClient().getSex().equals(sex)) {
                count++;
            }
        }*/
        for (int i = 0; i < size; i++) {
            if (accounts[i].getClient().getSex().equals(sex)) {
                count++;
            }
        }
        return count;
    }

    public BankAccount[] getExistingAccount() {
        BankAccount[] allAccount = new BankAccount[size];
        for (int i = 0; i < size; i++) {
            allAccount[i] = accounts[i];
        }
        return allAccount;
    }

    public double getBalanceOfBank() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += accounts[i].getBalance();
        }
        return sum;
    }

    public boolean transferMoney(int accountFrom, int accountTo, double sum) {
        int indexFrom = checkAccount(accountFrom);
        if (indexFrom < 0) {
            System.out.println("Withdrawal account is incorrect, please check and try again");
            return false;
        }
        int indexTo = checkAccount(accountTo);
        if (indexTo < 0) {
            System.out.println("Recipient´s account is incorrect, please check and try again");
            return false;
        }
        if (!accounts[indexFrom].credit(sum)) {
            System.out.println("The transit is not possible, you balance is try low");
            return false;
        }
        accounts[indexTo].debit(sum);
        System.out.println("your transit is finished, see detail below");
        System.out.println("-.-.-.-.-.-.-");
        System.out.println(sum + " was transferred to " + accounts[indexTo].getClient().toStringName());
        System.out.println("your balance is " + accounts[indexFrom].getBalance());
        return true;
    }
}
