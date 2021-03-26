package de.telran;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static int TCP_PORT = 3000;

    public static void main(String[] args) throws IOException {
        //make the server async, After accepting a socket open a new thread to handle the socket.
        //заставить сервер асинхронизироваться, после принятия сокета открыть новый поток для работы с сокетами.
       /* ServerSocket serverSocket = new ServerSocket(TCP_PORT);

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Connected");

            PrintStream socketOutput = new PrintStream(socket.getOutputStream());
            BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = socketInput.readLine()) != null) {
                String response = "Handled by server " + line;
                socketOutput.println(response);
            }
        }*/
       /* try (ServerSocket serverSocket = new ServerSocket(TCP_PORT);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {

            Socket socket = serverSocket.accept();
            PrintStream socketOutput = new PrintStream(socket.getOutputStream());

            System.out.println("Server socket created");

            String line;
            while ((line = br.readLine()) != null) {
                String response = "Handled by server " + line;
                socketOutput.println(response);

                if (br.ready()) {
                    System.out.println("Server found any message in channel");

                    String serverCommand = br.readLine();

                    if (serverCommand.equalsIgnoreCase("exit")) {
                        System.out.println("Server initiate exit");

                        serverSocket.close();
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        ServerSocket serverSocket = new ServerSocket(TCP_PORT);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        while (true) {
            Socket socket = serverSocket.accept();

            System.out.println("Connected");

            Runnable serverTask = new ServerTask(socket);
            executor.execute(serverTask);
        }
    }
}
