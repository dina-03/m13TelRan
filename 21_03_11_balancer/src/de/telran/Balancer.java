package de.telran;

import de.telran.server.ServerData;
import de.telran.server.ServerPriority;

import java.net.DatagramPacket;

public class Balancer implements Runnable {

    private DatagramPacket packetIn;
    private ServerPriority servers;

    public Balancer(DatagramPacket datagramPacket, ServerPriority servers) {
        this.packetIn = datagramPacket;
        this.servers = servers;
    }

    @Override
    public void run() {
        ServerData serverData = balancerParsing(packetIn);
        servers.update(serverData);
    }

    private ServerData balancerParsing(DatagramPacket datagramPacket) {
        String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        String[] parts = data.split(":");
        String host = parts[0];
        int port = Integer.parseInt(parts[1]);
        int load = Integer.parseInt(parts[2]);
        return new ServerData(host, port, load);
    }
}
