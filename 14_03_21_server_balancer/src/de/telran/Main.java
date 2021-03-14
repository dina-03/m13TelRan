package de.telran;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final int UDP_BALANCER_PORT = 3001;
    private static final int REPORTING_TIME = 100;
    private static final String UDP_BALANCER_HOST = "Host";
    private static final String INTERNAL_HOST = "Host";

    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(args[0]);

        Thread threadReporter = new Thread(new WorkloadReporter(UDP_BALANCER_PORT,
                REPORTING_TIME,
                UDP_BALANCER_HOST,
                INTERNAL_HOST, port));

        threadReporter.start();

        ExecutorService pool = Executors.newFixedThreadPool(10);

        ServerSocket serverSocket = new ServerSocket(port);

        while (true){
            Socket socket = serverSocket.accept();
            pool.execute(new Server(socket));
        }
    }
}
