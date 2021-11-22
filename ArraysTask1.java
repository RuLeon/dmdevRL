package razdel6.homework;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала
 */
public class ArraysTask1 {

    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        printArray(values);
        int[] resultArray = deleteNegativeElements(values);
        printArray(resultArray);
    }

    public static int[] deleteNegativeElements(int[] values) {
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                size++;
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (values[i] >= 0) {
                result[index] = values[i] * 5;
                index++;
            }
        }
        return result;
    }

    public static void printArray(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

