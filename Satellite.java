package com.dmdev.oop.homework;

public class Satellite extends SpaceObject implements Diameter {

    private String name;
    private int temperature;

    public Satellite(int weight, int circumference, String name, int temperature, int distanceToEarth) {
        super(weight, circumference, distanceToEarth);
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public void printMainInformation() {
        System.out.println("Иформация об объекте: наименование - " + getName() + ", температура поверхности " + getTemperature());
    }

    @Override
    public double getDiameter() {
        return getCircumference() / PI;
    }

    @Override
    public String toString() {
        return "Satellite {" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
