package com.company;

import java.util.ArrayList;

public class Vehicle {
    protected int speed, acceleration, capacity;
    protected boolean on;
    protected int id;
    protected ArrayList<Person> people = new ArrayList<>();

    protected String name;

    Vehicle() {
        speed = 0;
        acceleration = 0;
        on = false;
        name = "";
        id = -1;
        capacity = 0;
    }

    Vehicle(String name) {
        speed = 0;
        acceleration = 0;
        on = false;
        id = -1;
        this.name = name;
        capacity = 0;
    }

    Vehicle(String name, int capacity) {
        speed = 0;
        acceleration = 0;
        on = false;
        id = -1;
        this.name = name;
        this.capacity = capacity;
    }

    public String turnOn() {
        if (on) {
            return name + " is already on.";
        } else {
            on = true;
            return name + " is starting up.";
        }
    }

    public String turnOff() {
        if (!on) {
            return name + " is already off.";
        } else {
            on = true;
            return name + " is turning off.";
        }
    }

    public String accelerate(int amount) {
        if (on) {
            acceleration += amount;
            if (acceleration < 0) {
                acceleration = 0;
            }
            speed += acceleration;
            if (speed < 0) {
                speed = 0;
            }
            return name + " accelerates.\n" + name + " is moving at " + speed + " mph.";
        } else {
            return name + " is not running!";
        }
    }

    public String drift() {
        acceleration = 0;
        return name + " drifts, losing all acceleration.\n" + name + " is moving at " + speed + " mph.";
    }

    public String brake(int amount) {
        acceleration -= amount;
        if (acceleration > 0) {
            acceleration = 0;
        }
        speed += acceleration;
        if (speed < 0) {
            speed = 0;
        }
        return name + " brakes.\n" + name + " is moving at " + speed + " mph.";
    }

    public boolean addPerson(Person person) {
        if (people.size() >= capacity) {
            return false;
        } else {
            people.add(person);
            return true;
        }
    }

    public int getId() {
        if (id == -1) {
            System.out.println("This vehicle is not registered!");
        }
        return id;
    }

    public String getName() {
        return name;
    }
}
