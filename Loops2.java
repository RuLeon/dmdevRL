package Razdel5.HomeWork;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Loops2 {
    public static void main(String[] args) {
        int value = 52345;
        int number22 = getReverseInt(value);
        System.out.println(number22);
    }

    public static int getReverseInt(int value) {
        int resultNumber = 0;
        for (int i = value; i !=0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        return resultNumber;
    }
}
