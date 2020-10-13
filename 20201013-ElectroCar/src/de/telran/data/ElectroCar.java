package de.telran.data;

public class ElectroCar {
    private int ID;
    private Motor motor = new Motor();
    private Battery battery = new Battery();
    // private Wheel wheel;
    private String[] reports;
    private int reportsNumber = 0;

    public ElectroCar(int ID) {
        this.ID = ID;
        reports = new String[100];
        // wheel = new Wheel();
    }

    public String[] getReports() {
        return reports;
    }

    public class Motor {
        private void startMotor() {
            System.out.println("Motor of car " + ID + " is starting");
        }

        public String getMotorStatus() {
            return "motor is ok";
        }
    }

    public static class Battery {
        public void charge() {
            System.out.println("battery is charging...");
        }

        public String getBatteryStatus() {
            return "battery is full";
        }
    }

    public void start() {
        motor.startMotor();
        class CheckReport {
            private String motorCheck;
            private String batteryCheck;

            private CheckReport() {
                motorCheck = motor.getMotorStatus();
                batteryCheck = battery.getBatteryStatus();
            }

            private void writeReport() {
                System.out.println(motorCheck + ", " + batteryCheck);
            }
        }
        CheckReport checkReport = new CheckReport();
        checkReport.writeReport();
        System.out.println("electrocar " + ID + " go");
        reports[reportsNumber] = checkReport.motorCheck + ", " + checkReport.batteryCheck;
        reportsNumber++;
    }
}
