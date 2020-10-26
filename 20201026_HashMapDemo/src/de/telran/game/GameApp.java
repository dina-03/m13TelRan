package de.telran.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Map<Integer, Command> gameMap = new HashMap<>();
        Football football = new Football();
        gameMap.put(football.getNumber(), football);
        gameMap.put(1, new DuckHunting());
        gameMap.put(3, new Hockey());

        System.out.println("Choice game, enter number");
        System.out.println("1 - DuckHunting, 2 - Football, 3 - Hockey ");
        gameStart(gameMap);
    }

    public static void gameStart(Map<Integer, Command> gameMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (gameMap.containsKey(number)) {
            gameMap.get(number).execute();
        } else {
            System.out.println("wrong game number");
        }
        scanner.close();
    }
}
