package razdel6.homework;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class ArraysTask2 {

    public static void main(String[] args) {

        char[] values = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] result = charToInt(values);
        printArray(result);

        double average = calculateAverage(result);
        System.out.println(average);

        printArray(doFinalArray(result));
    }

    public static int[] charToInt(char[] values) {
        int[] newValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        return newValues;
    }

    public static double calculateAverage(int[] values) {
        double average = 0;
        for (int i = 0; i < values.length; i++) {
            average = average + values[i];
        }
        return average / values.length;
    }

    public static int[] doFinalArray(int[] values) {
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > calculateAverage(values)) {
                size++;
            }
        }

        int[] newArray = new int[size];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > calculateAverage(values)) {
                newArray[index] = values[i];
                index++;
            }
        }
        return newArray;
    }

    public static void printArray(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}