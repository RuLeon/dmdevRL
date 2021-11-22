package oop.homework;

import java.sql.SQLOutput;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль
 * выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 * и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class HouseRunner {

    public static void main(String[] args) {
        Room[] rooms1 =
                {
                        new Room(true),
                        new Room(false)
                };
        Room[] rooms2 =
                {
                        new Room(true),
                        new Room(false),
                        new Room(false)
                };
        Apartment[] apartments1 =
                {
                        new Apartment(1, rooms1),
                        new Apartment(2, rooms2)
                };
        Room[] rooms3 =
                {
                        new Room(false),
                        new Room(false)
                };
        Room[] rooms4 =
                {
                        new Room(true),
                        new Room(false),
                        new Room(false)
                };
        Apartment[] apartments2 =
                {
                        new Apartment(1, rooms3),
                        new Apartment(2, rooms4)
                };
        Floor[] floors =
                {
                        new Floor(1, apartments1),
                        new Floor(2, apartments2)
                };

        House house = new House(1, floors);
        house.print();
    }
}
