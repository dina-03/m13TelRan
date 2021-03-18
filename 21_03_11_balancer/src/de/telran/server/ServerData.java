package de.telran.server;

import java.time.LocalDateTime;
import java.util.Objects;

public class ServerData {
    private String host;
    private int port;
    private int load;
    private LocalDateTime dateTime;

    public ServerData(String host, int port, int load) {
        this.host = host;
        this.port = port;
        this.load = load;
        dateTime = LocalDateTime.now();
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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ServerData that = (ServerData) o;
        return port == that.port && Objects.equals(host, that.host);
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
