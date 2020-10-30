package de.telran;

import java.util.Scanner;

public class Game {
    private int attempts;
    private int secretNumber;
    private GameMessenger messenger;
    private GameNumberReader gameNumberReader;
    //private static Scanner input = new Scanner(System.in);

    public Game(int attempts, int secretNumber, GameMessenger messenger, GameNumberReader gameNumberReader) {
        this.attempts = attempts;
        this.secretNumber = secretNumber;
        this.messenger = messenger;
        this.gameNumberReader = gameNumberReader;
    }

    public void play() {
        doGreeting();
        boolean guess = guess();
        if (gameNumberReader instanceof ConsoleGameNumberReader){
            ((ConsoleGameNumberReader) gameNumberReader).getScanner().close();
        }
        showGameOver(guess);
    }

    private boolean guess() {
        while (attempts > 0) {
            int guessedNumber = gameNumberReader.getGuessedNumber();
            if (guessedNumber == secretNumber) {
                return true;
            } else {
                if (attempts != 1){
                    doTryAgain();
                }
                attempts--;
            }
        }
        return false;
    }

    private void showGameOver(boolean guess) {
        if (!guess) {
            doYouLose();
        } else {
            doYouWin();
        }
    }

    private void doGreeting() {
        messenger.sent("Welcome to the game! Enter a number");
    }

    private void doYouWin() {
        messenger.sent("You won!");
    }

    private void doYouLose() {
        messenger.sent("You lose!");
    }

    private void doTryAgain() {
        messenger.sent("Wrong guess, try again!");
    }
}
