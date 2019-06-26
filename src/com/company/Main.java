package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a new car: ");
        String command = "";
        Registration registration = new Registration();

        while (!command.toLowerCase().equals("q")) {
            command = read.nextLine();
            if (!command.toLowerCase().equals("q")) {
                Car c = new Car(command);
                System.out.println(registration.register(c));
            }
        }

        registration.displayRegistry();
    }
}
