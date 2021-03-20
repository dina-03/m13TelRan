package de.telran;

import de.telran.server.IServerMap;
import de.telran.server.ServerData;
import de.telran.server.ServerPriority;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UdpServerListener implements Runnable {
   /* private static final int PACKET_SIZE = 1024;
    private static final int UDP_PORT = 4000;

    private ServerPriority servers;

    public UdpBalancerListener(ServerPriority servers) {
        this.servers = servers;
    }*/

    /*@Override
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
    }*/

    private static final int PACKET_SIZE = 1024;
    IServerMap serverMap;
    int udpFromServerPort;

    public UdpServerListener(IServerMap serverMap, int udpFromServerPort) {
        this.serverMap = serverMap;
        this.udpFromServerPort = udpFromServerPort;
    }

    @Override
    public void run() {
        DatagramSocket serverUdpSocket;
        try {
            serverUdpSocket = new DatagramSocket(udpFromServerPort);
        } catch (SocketException e) {
            e.printStackTrace();
            return;
        }

        byte[] dataIn = new byte[PACKET_SIZE];
        DatagramPacket packetIn = new DatagramPacket(dataIn, PACKET_SIZE);

        try {
            while (true) {
                serverUdpSocket.receive(packetIn);
                handleDataFromServer(packetIn);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleDataFromServer(DatagramPacket packet) {
        String host = packet.getAddress().getHostAddress();

        byte[] bytes = packet.getData();
        String data = new String(bytes, 0, packet.getLength());
        String[] dataParts = data.split(":");

        int port = Integer.parseInt(dataParts[0]);
        int load = Integer.parseInt(dataParts[1]);

        ServerData serverData = new ServerData(host, port, load);
        serverMap.update(serverData);
    }
}
