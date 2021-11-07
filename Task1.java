package Razdel4.HomeWork;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes
 * и выводит на консоль в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {
        int minutes = 0;
        quarterOfAnHour(minutes);
    }

    public static void quarterOfAnHour(int minutes) {
        if (minutes >= 0 && minutes <= 15) {
            System.out.println(minutes + "-ая минута попадает в первую четверть часа.");
        } else if (minutes > 15 && minutes <= 30) {
            System.out.println(minutes + "-ая минута попадает во вторую четверть часа.");
        } else if (minutes > 31 && minutes <= 45) {
            System.out.println(minutes + "-ая минута попадает в третью четверть часа.");
        } else if (minutes > 45 && minutes <= 59) {
            System.out.println(minutes + "-ая минута попадает в третью четверть часа.");
        } else {
            System.out.println("Невозможно определить в какую четверть часа попадает указанная минута, " +
                    "т.к. в одном часе 60 минут!");
        }
    }
}
