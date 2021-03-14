package de.telran;

import de.telran.server.ServerPriority;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UdpBalancerListener extends Thread {
    private static final int PACKET_SIZE = 1024;
    private static final int UDP_PORT = 4000;

    private ServerPriority servers;

    public UdpBalancerListener(ServerPriority servers) {
        this.servers = servers;
    }

    @Override
    public void run() {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(UDP_PORT);
            ExecutorService executor = Executors.newFixedThreadPool(10);
            while (true) {
                byte[] fromHandler = new byte[PACKET_SIZE];
                DatagramPacket packetDatagram = new DatagramPacket(fromHandler, PACKET_SIZE);
                datagramSocket.receive(packetDatagram);

                executor.execute(new BalancerBalancer(packetDatagram, servers));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
