package Lesson7Hometask;

import javax.swing.*;

public class MobilePhone {
    String brand;
    String model;
    int batteryCapacity;
    int currentBatteryCapacity;
    int memory;
    boolean discharged;

    MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        currentBatteryCapacity = batteryCapacity;
        this.memory = memory;
    }

    void use(String appName, int h) {
        if (currentBatteryCapacity == 0) {
            System.out.println("Application " + appName + " can't be run on Samsung galaxy. Phone discharged");
        } else if ((currentBatteryCapacity - (h*100)) > 0) {
            System.out.println((appName + " has been ran for " + h + " hours on Samsung galaxy. Remain battery capacity: " + ((currentBatteryCapacity - (h * 100)) + " mAh")));
            currentBatteryCapacity = currentBatteryCapacity - (h * 100);
        } else if ((currentBatteryCapacity - (h * 100)) <= 0) {
            System.out.println(appName + " has been ran for " + h + " hours on Samsung galaxy. Phone has been discharged");
            currentBatteryCapacity = 0;
        }
    }

    void charge() {
        currentBatteryCapacity = batteryCapacity;
        System.out.println("Phone charged");
        }

    void installApp(String appName, int m) {
        if ((memory - m) > 0) {
            System.out.println((appName + " has been installed on Samsung galaxy. Remain memory: " + (memory - m) + " MB"));
            memory = memory - m;
        }
        else{
        System.out.println(appName + " can't be installed on Samsung galaxy. There are no enough memory");
        }
    }
}