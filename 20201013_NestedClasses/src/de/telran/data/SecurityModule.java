package de.telran.data;

public class SecurityModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("security module is starting");
    }

    @Override
    public void stopMonitoring() {

    }
}
