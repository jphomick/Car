package com.company;

public class Car extends Vehicle {
    String model;
    Person driver;

    Car() {
        super();
        model = "Homemade";
        driver = null;
    }

    Car(String name) {
        super(name, 4);
        model = "Homemade";
        driver = null;
    }

    Car(String name, String model) {
        super(name, 4);
        this.model = model;
        driver = null;
    }

    public void setDriver(Person driver) {
        if (people.contains(driver)) {
            this.driver = driver;
        }
    }

    @Override
    public String turnOn() {
        if (driver != null) {
            if (on) {
                return name + " is already on.";
            } else {
                on = true;
                return name + " is starting up.";
            }
        } else {
            return "There is no driver!";
        }
    }
}
