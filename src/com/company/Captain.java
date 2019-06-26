package com.company;

public class Captain extends Person {
    private int rank;

    Captain(String name, int age) {
        super(name, age);
        rank = 1;
    }

    public int rankUp() {
        rank++;
        return rank;
    }

    public int getRank() {
        return rank;
    }
}
