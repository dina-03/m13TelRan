package de.telran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageSupplier implements Runnable {

    OneItemStringQueue queue;

    public MessageSupplier(OneItemStringQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // reads from file
    public void readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null && !line.equals("exit")) {
                queue.addFirst(line);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
