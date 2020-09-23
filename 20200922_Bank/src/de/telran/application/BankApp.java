package de.telran.application;

import de.telran.dao.Bank;
import de.telran.data.BankAccount;
import de.telran.data.Person;
import de.telran.data.Sex;

import java.util.Arrays;

public class BankApp {
    public static void main(String[] args) {
        Person client1 = new Person("Ivan", "Ivanov", 1966, "Moscow", Sex.MALE);
        Person client2 = new Person("Ivana", "Ivanova", 1969, "Moscow", Sex.FEMALE);
        Person client3 = new Person("Masha", "Malinova", 1975, "Berlin", Sex.FEMALE);
        Person client4 = new Person("Pasha", "Tchudnov", 1979, "Hamburg", Sex.MALE);
        Person client5 = new Person("Katya", "Pavlova", 1983, "Minsk", Sex.FEMALE);
        Person client6 = new Person("Malvina", "Sokolova", 2000, "Kiev", Sex.FEMALE);
        Person client7 = new Person("Richard", "Frolov", 1999, "Berlin", Sex.MALE);

        BankAccount account1 = new BankAccount(client1, 2000);
        BankAccount account2 = new BankAccount(client2, 500);
        BankAccount account3 = new BankAccount(client3, 5010);
        BankAccount account4 = new BankAccount(client4, 7010);
        BankAccount account5 = new BankAccount(client5, 3320);
        BankAccount account6 = new BankAccount(client6, 5470);
        BankAccount account7 = new BankAccount(client7, 8299);

        Bank myBank = new Bank(100);
        myBank.addAccount(account1);
        myBank.addAccount(account2);
        myBank.addAccount(account3);
        myBank.addAccount(account4);
        myBank.addAccount(account5);
        myBank.addAccount(account6);
        myBank.addAccount(account7);
        //myBank.displayAccount();

       /* myBank.transferMoney(12000011, 12000012, 200.00);
        Person.split();
        myBank.transferMoney(12000012, 12000011, 1000.00);
        Person.split();
     myBank.displayAccount();*/
        // Person.split();
        System.out.println("Клиенты мужского пола:");
        myBank.displayClientsPerSex(Sex.MALE);
        Person.split();
        System.out.println("Клиенты женского пола:");
        myBank.displayClientsPerSex(Sex.FEMALE);
        Person.split();
        System.out.println("Всего клиентов мужского пола:");
        System.out.println((myBank.getCountsClientsPerSex(Sex.MALE)));
        System.out.println("Всего клиентов женского пола:");
        System.out.println((myBank.getCountsClientsPerSex(Sex.FEMALE)));
        Person.split();
        System.out.println(Arrays.toString(myBank.getClientsPerSex()));
    }
}
