package de.telran;

public class ConsoleGameMessenger implements GameMessenger{
    @Override
    public void sent(String string) {
        System.out.println(string);
    }
}
