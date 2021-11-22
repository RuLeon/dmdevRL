package oop.homework;

public class Room {

    private boolean value;

    public Room(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public void print() {
        if (value) {
            System.out.println("Комната проходная.");
        } else {
            System.out.println("Комната не проходная.");
        }
    }
}
