package de.telran.application;

import de.telran.data.User;

public class UserApp {
    public static void main(String[] args) {
        User user1 = new User("Hans Oliesch");
        User user2 = new User("Sonya Winter");
        User user3 = new User("Dimitry Hesse");
        User user4 = new User("Artur Jurgen");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
