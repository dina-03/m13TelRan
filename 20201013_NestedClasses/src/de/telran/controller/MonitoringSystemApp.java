package de.telran.controller;

import de.telran.data.ErrorModule;
import de.telran.data.GeneralModule;
import de.telran.data.MonitoringSystem;
import de.telran.data.SecurityModule;

public class MonitoringSystemApp {
    public static void main(String[] args) {
        /*GeneralModule gm = new GeneralModule();
        ErrorModule em = new ErrorModule();
        SecurityModule sm = new SecurityModule();
        gm.startMonitoring();
        em.startMonitoring();
        sm.startMonitoring();*/
        MonitoringSystem generalMod = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("general mode is starting");
            }

            @Override
            public void stopMonitoring() {
                System.out.println("general mode is stopping");
            }
        };
        MonitoringSystem errorMod = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("error mode is starting");
            }

            @Override
            public void stopMonitoring() {

            }
        };
        MonitoringSystem securityMod = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("security mode is starting");
            }

            @Override
            public void stopMonitoring() {

            }
        };
        generalMod.startMonitoring();
        errorMod.startMonitoring();
        securityMod.startMonitoring();
        generalMod.stopMonitoring();
    }
}
