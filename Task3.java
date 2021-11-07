package Razdel4.HomeWork;

/**
 * Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше,
 * меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Task3 {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 4;
        int a2 = 10;
        int b2 = 4;
        double Triangle1 = areaOfTriangle1(a1, b1);
        System.out.println("Площадь треугольника № 1 = " + Triangle1);
        double Triangle2 = areaOfTriangle2(a2, b2);
        System.out.println("Площадь треугольника № 2 = " + Triangle2);
        comparisonOfTriangles(Triangle1, Triangle2);
    }

    public static double areaOfTriangle1(int side1, int side2) {
        double result1 = (double) (side1 * side2) / 2;
        return result1;
    }

    public static double areaOfTriangle2(int side1, int side2) {
        double result2 = (double) (side1 * side2) / 2;
        return result2;
    }

    public static void comparisonOfTriangles(double result1, double result2) {
        if (result1 > result2) {
            System.out.println("Площадь треугольника № 1 > площади треугольника № 2");
        } else if (result1 < result2) {
            System.out.println("Площадь треугольника № 1 < площади треугольника № 2");
        } else {
            System.out.println("Площади треугольников № 1 и № 2 равны.");
        }
    }
}
