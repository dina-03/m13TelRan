package de.telran;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class Server implements Runnable {

    Socket socket;
    AtomicInteger connectionCounter;

    public Server(Socket socket, AtomicInteger connectionCounter) {
        this.socket = socket;
        this.connectionCounter = connectionCounter;
    }

    @Override
    public void run() {
        try (PrintStream out = new PrintStream(socket.getOutputStream());
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

            System.out.println("InputStream created");
            System.out.println("OutputStream  created");

            String line;
            while ((line = in.readLine()) != null) {
                String answer = String.format("String was received from the client", line);
                out.println(answer);

            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connectionCounter.decrementAndGet();
        }
    }
}
