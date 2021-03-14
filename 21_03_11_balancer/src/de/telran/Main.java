package de.telran;

import de.telran.server.ServerPriority;

public class Main {

    private static final long CLEANER = 5000;

    public static void main(String[] args) {
        ServerPriority servers = new ServerPriority();
        LoadServer loadServer = new LoadServer(servers);

        new UdpBalancerListener(servers).start();

        new Thread(loadServer).start();
    }
}
