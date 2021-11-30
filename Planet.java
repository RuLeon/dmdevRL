package com.dmdev.oop.homework;

public class Planet extends SpaceObject implements Diameter {

    private String name;
    private int numberOfSatellites;

    public Planet(int weight, int circumference, String name, int numberOfSatellites, int distanceToEarth) {
        super(weight, circumference, distanceToEarth);
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public void printMainInformation() {
        System.out.println("Иформация об объекте: наименование - " + getName() + ", количество спутников " + getNumberOfSatellites());
    }

    @Override
    public double getDiameter() {
        return getCircumference() / PI;
    }

    @Override
    public String toString() {
        return "Planet {" +
                "name='" + name + '\'' +
                ", numberOfSatellites=" + numberOfSatellites +
                '}';
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
