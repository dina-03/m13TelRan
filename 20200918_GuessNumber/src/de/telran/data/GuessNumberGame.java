package de.telran.data;

public class GuessNumberGame {
    public void guessNumber(Messenger messenger) {
        messenger.displayMessage("Hi Player!");
        messenger.displayMessage("Enter range for number");
        int range = messenger.getNumber();
        messenger.displayMessage("i guess the number from 0 to " + range);
        int guessNumber = randomNumber(range);
        int userNumber;
        while (true) {
            messenger.displayMessage("Enter number ");
            userNumber = messenger.getNumber();
            if (userNumber == guessNumber) {
                messenger.displayMessage("Bingo!");
                break;
            } else if (userNumber > guessNumber) {
                messenger.displayMessage("my number is less");
            } else {
                messenger.displayMessage("my number is greater");
            }
        }
        messenger.closeMessenger();
    }

    public static int randomNumber(int range) {
        return (int) (Math.random() * range);
    }

}
