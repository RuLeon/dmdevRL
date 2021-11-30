package com.dmdev.oop.homework;

public final class SpaceUtils {

    private SpaceUtils() {
    }

    public static boolean isStar(SpaceObject object) {
        return object instanceof Star;
    }

//    public static double getGravity(SpaceObject object1, SpaceObject object2) {
//        double result = 0;
//        return result;
//    }

}
