package com.company;

import java.util.ArrayList;

public class Registration {

    private ArrayList<Vehicle> registry = new ArrayList<>();

    public String register(Vehicle vehicle) {
        if (vehicle.id == -1) {
            vehicle.id = registry.size();
            registry.add(vehicle);
            return vehicle.getName() + " has been registered! The id is " + vehicle.id;
        } else {
            return "The vehicle is already registered!";
        }
    }

    public void displayRegistry() {
        for (Vehicle vehicle : registry) {
            System.out.print(vehicle.getId() + " : " + vehicle.getName() + "\n");
        }
    }

    public Vehicle getVehicle(int id) {
        for (Vehicle vehicle : registry) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }
}
