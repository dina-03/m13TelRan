package de.telran;

import java.io.*;
import java.net.Socket;

public class ClientTCP {
    static int TCP_PORT = 3000;

    public static void main(String[] args) throws IOException {

        try (Socket socket = new Socket("localhost", TCP_PORT);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             DataOutputStream socketOutput = new DataOutputStream(socket.getOutputStream());
             DataInputStream socketInput = new DataInputStream(socket.getInputStream());) {

            System.out.println("Client connected to socket");
            System.out.println();
            System.out.println("Client writing channel");

            while (!socket.isOutputShutdown()) {

                if (br.ready()) {

                    System.out.println("Client start writing in channel...");
                    Thread.sleep(1000);
                    String clientCommand = br.readLine();

                    socketOutput.writeUTF(clientCommand);
                    socketOutput.flush();
                    System.out.println("Client sent message " + clientCommand + " to server.");

                    Thread.sleep(1000);

                    if (clientCommand.equalsIgnoreCase("exit")) {

                        System.out.println("Client connections");
                        Thread.sleep(2000);

                        if (socketInput.read() > -1) {
                            System.out.println("reading...");
                            String in = socketInput.readUTF();
                            System.out.println(in);
                        }
                        break;
                    }

                    System.out.println("Client sent message & start waiting for data from server...");
                    Thread.sleep(2000);

                    if (socketInput.read() > -1) {

                        System.out.println("reading...");
                        String in = socketInput.readUTF();
                        System.out.println(in);
                    }
                }
            }

            System.out.println("Closing connection & channel on clientSide - DONE.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
