package de.telran.server;

import java.time.LocalDateTime;
import java.util.Objects;

public class ServerData {
    private String host;
    private int port;
    private int load;
    private LocalDateTime dateTime = LocalDateTime.now();

    public ServerData(String host, int port, int load) {
        this.host = host;
        this.port = port;
        this.load = load;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public int getLoad() {
        return load;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServerData)) return false;
        ServerData that = (ServerData) o;
        return Objects.equals(host, that.host) && Objects.equals(port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, port, load);
    }

    @Override
    public String toString() {
        return "host: " + host +
                ", port: " + port;
    }
}
