package de.telran.server;

import java.util.PriorityQueue;

public class ServerPriority {

    private ServerData serverData;
     PriorityQueue<ServerData> servers;

    public ServerPriority() {
        servers = new PriorityQueue<ServerData>();
    }

    public synchronized ServerData getBest() {
        return servers.peek();
    }

    public synchronized void update(ServerData serverData) {
        servers.remove(serverData);
        servers.add(serverData);
    }
}
