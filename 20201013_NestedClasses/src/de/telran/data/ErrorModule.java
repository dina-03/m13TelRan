package de.telran.data;

public class ErrorModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("error module is starting");
    }

    @Override
    public void stopMonitoring() {

    }
}
