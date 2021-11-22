package oop.homework;

public class Floor {

    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    public void print() {
        System.out.println("Этаж " + number + "," + "количество квартир " + apartments.length);
    }
}