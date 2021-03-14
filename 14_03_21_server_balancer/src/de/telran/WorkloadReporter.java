package de.telran;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class WorkloadReporter implements Runnable {

    int loadBalancerPort;
    int period;
    String balancerHost;
    String internalHost;
    int internalPort;

    public WorkloadReporter(int loadBalancerPort,
                            int period,
                            String balancerHost,
                            String internalHost,
                            int internalPort) {
        this.loadBalancerPort = loadBalancerPort;
        this.period = period;
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
                Thread.sleep(period);

                String message = internalHost + internalPort;
                byte[] dataOut = message.getBytes();
                DatagramPacket packet = new DatagramPacket(dataOut,
                        dataOut.length,
                        balancerAddress,
                        loadBalancerPort
                );

                socket.send(packet);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
