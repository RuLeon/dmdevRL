package com.dmdev.oop.homework;

public abstract class SpaceObject implements Printable, Diameter {
    public static final double PI = 3.14;
    private int weight;
    private int circumference;
    private int distanceToEarth;

    public SpaceObject(int weight, int circumference, int distanceToEarth) {
        this.weight = weight;
        this.circumference = circumference;
        this.distanceToEarth = distanceToEarth;
    }

    public abstract String toString();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }
}
