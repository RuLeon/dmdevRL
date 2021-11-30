package com.dmdev.oop.homework;

public class Comet extends SpaceObject implements Diameter {

    private String name;
    private int speed;

    public Comet(int weight, int circumference, String name, int speed, int distanceToEarth) {
        super(weight, circumference, distanceToEarth);
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void printMainInformation() {
        System.out.println("Иформация об объекте: наименование - " + getName() + ", скорость" + getSpeed());
    }

    @Override
    public double getDiameter() {
        return getCircumference() / PI;
    }

    @Override
    public String toString() {
        return "Comet {" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
