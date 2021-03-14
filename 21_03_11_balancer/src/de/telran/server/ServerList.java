package de.telran.server;

import java.util.Objects;

public class ServerList implements Comparable<ServerList>{

    private int port;
    private String ip;
    private int load;

    public ServerList(int port, String ip, int load) {
        this.port = port;
        this.ip = ip;
        this.load = load;
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }

    public int getLoad() {
        return load;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ServerList that = (ServerList) o;
        return port == that.port && load == that.load && Objects.equals(ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, ip, load);
    }

    @Override
    public int compareTo(ServerList o) {
        return Integer.compare(this.load, o.load);
    }

    @Override
    public String toString() {
        return "port: " + port +
                ", ip: " + ip +
                ", load: "  + load;
    }
}
