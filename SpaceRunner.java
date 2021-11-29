package com.dmdev.oop.homework;

public class SpaceRunner {

    public static void main(String[] args) {
        SpaceObject asteroid = new Asteroid(100, 200, "Victoria", 1000, 12);
        SpaceObject blackhole = new BlackHole(200, 500, "Black Hole", "medium", 15);
        SpaceObject comet = new Comet(250, 600, "17P/Holms", 500, 16);
        SpaceObject exoplanet = new Exoplanet(150, 200, "Pegas", 1000, 500);
        SpaceObject galaxy = new Galaxy(600, 500, "Via Lactea", 452);
        SpaceObject meteorite = new Meteorite(1000, 500, "Chelyabinsk", "iron-stone", 560);
        SpaceObject planet = new Planet(500, 800, "Neptune", 2, 55);
        SpaceObject satellite = new Satellite(900, 1000, "Moon", 150, 65);
        SpaceObject star = new Star(500, 2000, "Sun", 5000, 100);

        System.out.println(asteroid);
        System.out.println(blackhole);

        printMainInformation(planet);

        getDiameter(star);

        System.out.println(SpaceUtils.isStar(asteroid));
        //System.out.println(SpaceUtils.getGravity(asteroid, star));

    }

    public static void printMainInformation(Printable... objects) {
        for (Printable object : objects) {
            object.printMainInformation();
        }
    }

    public static void getDiameter(Diameter... objects) {
        for (Diameter object : objects) {
            System.out.println("Диаметр объекта " + object + "= " + object.getDiameter());
        }
    }

}



