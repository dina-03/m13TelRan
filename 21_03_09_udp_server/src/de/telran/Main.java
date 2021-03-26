package de.telran;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {

    private final static int UDP_SERVER_PORT = 3000;
    private final static int PACKET_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        DatagramSocket serverUDPSocket = new DatagramSocket(UDP_SERVER_PORT);
        byte[] dataIn = new byte[PACKET_SIZE];
        DatagramPacket packetIn = new DatagramPacket(dataIn, PACKET_SIZE);

        while (true) {
            serverUDPSocket.receive(packetIn);
            String line = new String(dataIn, 0, packetIn.getLength());

            String response = "Handled a datagram from the port: " + packetIn.getPort() + ", received data: " + line;

            byte[] dataOut = response.getBytes();
            DatagramPacket packetOut = new DatagramPacket(
                    dataOut,
                    dataOut.length,
                    packetIn.getAddress(),
                    packetIn.getPort()
            );
            serverUDPSocket.send(packetOut);
        }
    }
}
