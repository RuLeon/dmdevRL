package com.dmdev.oop.homework;

public class Meteorite extends SpaceObject implements Diameter {

    private String name;
    private String type;

    public Meteorite(int weight, int circumference, String name, String type, int distanceToEarth) {
        super(weight, circumference, distanceToEarth);
        this.name = name;
        this.type = type;
    }

    @Override
    public void printMainInformation() {
        System.out.println("Иформация об объекте: наименование - " + getName() + ", тип " + getType());
    }

    @Override
    public double getDiameter() {
        return getCircumference() / PI;
    }

    @Override
    public String toString() {
        return "Meteorite {" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
