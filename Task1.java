package Razdel5.HomeWork;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Task1 {
    public static void main(String[] args) {
        int value = 228910;
        int counter1 = quantityOfChetnie(value);
        int counter2 = quantityOfNeChetnie(value);
        System.out.println("В введенном числе " + counter1 + " ЧЕТНЫХ и " + counter2 + " НЕЧЕТНЫХ цифры.");
    }

    public static int quantityOfChetnie(int value) {
        int counter = 0;
        for (int currentValue = value; currentValue != 0; currentValue = currentValue / 10) {
            int number = currentValue % 10;
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int quantityOfNeChetnie(int value) {
        int counter = 0;
        for (int currentValue = value; currentValue != 0; currentValue = currentValue / 10) {
            int number = currentValue % 10;
            if (number % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}