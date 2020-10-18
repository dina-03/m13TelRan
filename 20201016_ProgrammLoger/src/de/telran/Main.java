package de.telran;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProgrammLoger.getInstance());
        System.out.println(ProgrammLoger.getInstance());
        System.out.println(ProgrammLoger.getInstance());
        ProgrammLoger.getInstance().showLogFile();
        ProgrammLoger.getInstance().addLogInfo("log one ...");
        ProgrammLoger.getInstance().addLogInfo("log two ...");
        ProgrammLoger.getInstance().addLogInfo("log tree ...");
        ProgrammLoger.getInstance().showLogFile();
    }
}
