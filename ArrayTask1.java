package lessonArrays;

/**
 * Дан одномерный массив целых чисел. Написать функцию, удаляющую из него все
 * отрицательные элементы (удалить - значит создать новый массив с только
 * положительными элементами). После удаления - умножить каждый элемент массива
 * на его длину. Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала
 */
public class ArrayTask1 {

    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] resultArray = deleteNegativeElements(values);
    }

    public static int[] deleteNegativeElements(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                values[i] *= 5;
                System.out.print(values[i] + " ");
            }
        }
        return values;
    }
}
