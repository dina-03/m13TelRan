package de.telran.server;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

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

    public void removeUnused(Duration duration){
        LocalDateTime now = LocalDateTime.now();

        servers = servers.stream()
                .filter(server -> server
                .getDateTime()
                .isAfter(now.minus(duration)))
                .collect(Collectors.toCollection(PriorityQueue::new));
    }
}
