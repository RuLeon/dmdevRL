package com.dmdev.oop.homework;

public class Asteroid extends SpaceObject implements Diameter {

    private String name;
    private int speed;

    public Asteroid(int weight, int circumference, String name, int speed, int distanceToEarth) {
        super(weight, circumference, distanceToEarth);
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void printMainInformation() {
        System.out.println("Иформация об объекте: наименование - " + getName() + ", скорость " + getSpeed());
    }

    @Override
    public double getDiameter() {
        return getCircumference() / PI;
    }

    @Override
    public String toString() {
        return "Asteroid {" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
