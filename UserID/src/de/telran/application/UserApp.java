package de.telran.application;

import de.telran.data.User;

public class UserApp {
    public static void main(String[] args) {
        User user1 = new User("Hans Oliesch");
        User user2 = new User("Sonya Winter");
        User user3 = new User("Dimitry Hesse");
        User user4 = new User("Artur Jurgen");
        User user5 = new User("Artur Jurge");
        User user6 = new User("Artur Jurg");
        User user7 = new User("Artur Jur");
        User user8 = new User("Artur Ju");
        User user9 = new User("Artur J");
        User user10 = new User("Artur A");
        User user11 = new User("Artur B");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user10);
        System.out.println(user11);
        System.out.println(user5);
    }
}
