package Razdel5.HomeWork;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer
 * с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Loops3 {
    public static void main(String[] args) {
        double salary = 600;
        double dohod = bankAccount(600);
        System.out.println(dohod);
    }

    public static double bankAccount(int salary) {
        double result = salary;
        for (int month = 1; month <= 38; month++) {
            double dohod = salary - 300 - salary * 0.1 + ((salary * 0.1) * 0.02);
            if (month % 6 == 0) {
                dohod += 400;
                result += dohod;
            }
        }
        return result;
    }
}