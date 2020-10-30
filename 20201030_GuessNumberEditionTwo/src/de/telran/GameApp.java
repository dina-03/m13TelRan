package de.telran;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Game game = new Game(3,4,new ConsoleGameMessenger(), new ConsoleGameNumberReader());
        //game.play();

        GameNumberReader gr = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        };
        Game game1 = new Game(5,10,string -> System.out.println(string), gr);
        game1.play();
    }
}
