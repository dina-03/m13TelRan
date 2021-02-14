package de.telran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;

public class Supplier implements Runnable {

    private final BufferedReader br;
    private final BlockingQueue<String> queue;

    public Supplier(BufferedReader br, BlockingQueue<String> queue) {
        this.br = br;
        this.queue = queue;
    }

    @Override
    public void run() {
        //TODO read lines and pass every line to the queue via method put
        String line;
        try {
            while ((line = br.readLine()) != null) {
                queue.put(line);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
