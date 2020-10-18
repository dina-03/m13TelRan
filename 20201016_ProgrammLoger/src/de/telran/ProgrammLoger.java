package de.telran;

public class ProgrammLoger {                // порождающий паттерн
    private static ProgrammLoger programmLoger;
    private static String logFile;

    private ProgrammLoger() {
        logFile = "this is log file\n";
    }

    public static ProgrammLoger getInstance() {
        if (programmLoger == null) {
            programmLoger = new ProgrammLoger();
        }
        return programmLoger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
