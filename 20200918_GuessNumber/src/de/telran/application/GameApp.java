package de.telran.application;

import de.telran.data.GuessNumberGame;
import de.telran.data.Messenger;

public class GameApp {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        GuessNumberGame game = new GuessNumberGame();
        game.guessNumber(messenger);
        //System.out.println(GuessNumberGame.randomNumber(20));
    }
}
