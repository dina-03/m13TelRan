package de.telran;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {

    static int TCP_PORT = 3000;

    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(TCP_PORT);) {

            Socket client = serverSocket.accept();
            System.out.println("Connected...");

            DataOutputStream socketOutput = new DataOutputStream(client.getOutputStream());
            System.out.println("DataOutStream created");

            DataInputStream socketInput = new DataInputStream(client.getInputStream());
            System.out.println("DataInputStream created");

            while (!client.isClosed()) {

                System.out.println("Server reading from channel");

                String entry = socketInput.readUTF();
                System.out.println("READ from client message - " + entry);

                System.out.println("Server try writing to channel");

                if (entry.equalsIgnoreCase("exit")) {
                    System.out.println("Client initialize connection...");

                    socketOutput.writeUTF("Server reply - " + entry + " - OK");
                    socketOutput.flush();

                    Thread.sleep(3000);
                    break;
                }
                socketOutput.writeUTF("Server reply - " + entry + " - OK");
                System.out.println("Server wrote message to client");

                socketOutput.flush();
            }

            System.out.println("Client disconnected");
            System.out.println("Closing connections & channels");

            socketInput.close();
            socketOutput.close();
            client.close();

            System.out.println("Closing connections & channels - DONE.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
