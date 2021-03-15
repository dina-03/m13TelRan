package de.telran;

import de.telran.server.ServerData;
import de.telran.server.ServerPriority;

import java.io.IOException;
import java.net.*;

public class LoadServer implements Runnable{

    private static final int  EXTERNAL_SERVER_PORT = 3000;
    private static final String EXTERNAL_HOST = "localhost";
    private ServerPriority servers;

    public LoadServer(ServerPriority servers) {
        this.servers = servers;
    }

    @Override
    public void run() {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName(EXTERNAL_HOST);

            ServerData list = servers.getBest();

            if (list == null)
                return;

            byte[] outData = list.toString().getBytes();
            DatagramPacket outPacket = new DatagramPacket(
                    outData,outData.length,address,EXTERNAL_SERVER_PORT
            );
            socket.send(outPacket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
