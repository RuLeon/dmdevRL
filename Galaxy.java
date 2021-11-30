package com.dmdev.oop.homework;

public class Galaxy extends SpaceObject implements Diameter {

    private String name;

    public Galaxy(int weight, int circumference, String name, int distanceToEarth) {
        super(weight, circumference, distanceToEarth);
        this.name = name;
    }

    @Override
    public void printMainInformation() {
        System.out.println("Иформация об объекте: наименование - " + getName() + ", длина окружности " + getCircumference());
    }

    @Override
    public double getDiameter() {
        return getCircumference() / PI;
    }

    @Override
    public String toString() {
        return "Galaxy {" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
