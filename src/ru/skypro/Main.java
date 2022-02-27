package ru.skypro;

import java.util.Arrays;

public class Main {
    // Задание 1 (методы)
    public static String printKindOfYear(String n) {
        System.out.println("Номер года - " + n + "високосный год");
        return n;
    }

    public static boolean checkLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    // Задание 2 (методы)
    public static void printApplication(int type, int year) {
        String OS = "Android";
        String version = "";
        if (type == 0) {
            OS = "iOS";
        }
        if (year < 2015) {
            version = "облегченную ";
        }
        System.out.println("Установите " + version + "версию приложения для " + OS + " по ссылке");
    }

    // Задание 3 (метод)
    public static int numbersDays(int distance) {
        int day = 1;
        if (distance <= 20) {
            day = day;
        } else if (distance > 20 && distance <= 60) {
            day = day + 1;
        } else if (distance > 60 && distance <= 100) {
            day = day + 2;
        }
        return day;
    }

    // Задание 4 (метод)
    public static void printAnswerCheckLine(String line) {
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                System.out.println("есть дубль: " + line.charAt(i));
                break;
            } else if (i == line.length() - 2) {
                System.out.println("нет дублей");
            }
        }
    }

    // Задание 5 (метод)
    public static void ternArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = a;
        }
    }

    // Задание 6 (метод)

    // Генератор случайных чисел
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int spending (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int days(int[] arr) {
        int day = arr.length;
        return day;
    }

    public static float average(int monthSpending, int days) {
        float a = monthSpending / days;
        return a;
    }

    public static void printing(int spending, float average) {
        System.out.println( "Сумма трат за месяц составила " + spending + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }


    public static void main(String[] args) {
        // Задание 1
        int year = 2021;
        String not = "не ";
        if (checkLeapYear(year)) {
            not = "";
        }
        printKindOfYear(not);

        // Задание 2
        int clientDeviceYear = 2014;
        int clientOS = 1;
        printApplication(clientOS, clientDeviceYear);

        // Задание 3
        int deliveryDistance = 65;
        System.out.println("количество дней: " + numbersDays(deliveryDistance));

        // Задание 4
        String line = "acdgijk";
        printAnswerCheckLine(line);

        // Задание 5
        int[] arr = new int[]{3, 5, 7, 2, 1};
        ternArray(arr);
        System.out.println(Arrays.toString(arr));

        // Задание 6
        int[] data = generateRandomArray();

        System.out.println(Arrays.toString(data));

        int monthSpending = spending(data);
        int numberOfDays = days(data);
        float averageSpending = average(monthSpending, numberOfDays);

        printing(monthSpending, averageSpending);
    }
}
