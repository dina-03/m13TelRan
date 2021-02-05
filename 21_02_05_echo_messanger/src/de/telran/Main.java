package de.telran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Echo echo = new Echo();
        Thread echoTh = new Thread(echo);
        echoTh.setDaemon(true);
        echoTh.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null && !line.equals("exit")){
            echo.setMessage(line);
            echoTh.interrupt();
        }
    }
}
