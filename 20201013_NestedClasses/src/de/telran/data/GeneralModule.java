package de.telran.data;

public class GeneralModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("general module is starting");
    }

    @Override
    public void stopMonitoring() {

    }
}
