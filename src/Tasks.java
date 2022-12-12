import java.util.Random;
public class Tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        System.out.println("Задания выполнены.");
    }

    private static void task4() {
        /**
         * В бухгалтерской книге появился баг.
         * Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону.
         * Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
         * Данные с именами сотрудников хранятся в виде массива символов — char[ ].
         *
         * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников
         * в корректном виде. В качестве данных для массива используйте:
         *
         * char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
         *
         * В результате в консоль должно быть выведено: Ivanov Ivan.
         *
         * Важно: не используйте дополнительные массивы для решения этой задачи.
         * Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
         */
        System.out.println("\n Задача 4 :");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static void task3() {
        /**
         * Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
         *
         * Напишите программу, которая посчитает среднее значение трат за месяц
         * (то есть сумму всех трат за месяц поделить на количество дней),
         * и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
         *
         * Важно помнить: подсчет среднего значения может иметь остаток,
         * то есть быть не целым, а дробным числом.
         */
        System.out.println("\n Задача 3 :");
        int[] speningDay = getArrayRandom();
        int sum = 0;

        for (int element : speningDay) {
            sum += element;
        }

        double midleSpening = sum*(1.)/speningDay.length;
        System.out.println("Средняя сумма трат за месяц составила " + midleSpening + " рублей");
    }

    private static void task2() {
        /**
         * Также бухгалтерия попросила найти минимальную и максимальную трату за день.
         *
         * Напишите программу, которая решит эту задачу,
         * и выведите в консоль результат в формате:
         * «Минимальная сумма трат за день составила … рублей.
         * Максимальная сумма трат за день составила … рублей».
         */
        System.out.println("\n Задача 2: ");
        int[] spendingDay = getArrayRandom();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIdnex = 0;
        int minIndex = 0;

        for (int i = 0; i < spendingDay.length; i++) {
            if (spendingDay[i] > max) {
                max = spendingDay[i];
                maxIdnex = i;
            }
            if (spendingDay[i] < min) {
                min = spendingDay[i];
                minIndex = i;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Это был "+ (minIndex+1) + " день месяца");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей. " +
                "Это был "+ (maxIdnex+1) + " день месяца");
    }

    private static void task1() {
        /**
         * Бухгалтеры попросили посчитать сумму всех выплат за месяц.
         *
         * Напишите программу, которая решит эту задачу,
         * и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей»
         */
        System.out.println("Задача 1: ");
        int[] dayPayments = getArrayRandom();
        int sum = 0;


        for (int element : dayPayments) {
            sum += element;
        }
        System.out.println("Сумма всех выплат за месяц составила : " + sum + " рублей");
    }

    private static int[] getArrayRandom() {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000)+100_000;
        }
        return array;
    }



}
