package de.telran;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import java.net.*;

public class WorkloadReporter implements Runnable {

    private final String loadBalancerPort;
    private final int period;
    private final String balancerHost;
    private final String internalHost;
    private final int internalPort;
    private final AtomicInteger connectionCounter;

    public WorkloadReporter(String loadBalancerPort,
                            int period,
                            AtomicInteger connectionCounter,
                            String balancerHost,
                            String internalHost,
                            int internalPort) {
        this.loadBalancerPort = loadBalancerPort;
        this.period = period;
        this.connectionCounter = connectionCounter;
        this.balancerHost = balancerHost;
        this.internalHost = internalHost;
        this.internalPort = internalPort;
    }

    @Override
    public void run() {

        try {
            InetAddress balancerAddress = InetAddress.getByName(balancerHost);
            DatagramSocket socket = new DatagramSocket();

            while (true) {
                /* Thread.sleep(period);*/
                String message = internalHost + ":" + internalPort + ":" + connectionCounter;
                System.out.println(message);
                byte[] dataOut = message.getBytes();
                DatagramPacket packet = new DatagramPacket(
                        dataOut,
                        dataOut.length,
                        balancerAddress,
                        Integer.parseInt(loadBalancerPort)
                );

                socket.send(packet);
                Thread.sleep(period);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
