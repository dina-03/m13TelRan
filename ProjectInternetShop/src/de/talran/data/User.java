package de.talran.data;

import java.util.Scanner;

public class User {
    private String userName;
    private int age;
    private String password;
    Basket basket;

    public User(String userName, String password, Basket basket) {
        this.userName = userName;
        this.password = password;
        this.password = password;
        this.basket = basket;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserName: " + userName +
                ", age: " + age;
    }

    public boolean checkPassword(Scanner scanner) {
        int count = 3;
        while (count > 0) {
            System.out.println("Enter password, please");
            String password = scanner.nextLine();
            if (this.password.equals(password)) {
                return true;
            } else
                count--;
        }
        return false;
    }
}
