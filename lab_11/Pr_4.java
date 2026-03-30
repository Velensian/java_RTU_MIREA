package lab_11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// 4
public class Pr_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        int month;
        int day;
        int hour;
        int minute;

        while (true) {
            System.out.print("Введите год (например, 2023): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 1900) break;
            } else {
                scanner.next();
            }
            System.out.println("Некорректный ввод. Пожалуйста, введите целое число больше или равное 1900.");
        }

        while (true) {
            System.out.print("Введите месяц (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) break;
            } else {
                scanner.next();
            }
            System.out.println("Некорректный ввод. Пожалуйста, введите целое число от 1 до 12.");
        }

        while (true) {
            System.out.print("Введите число (1-31): ");
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                if (isValidDay(year, month, day)) break;
            } else {
                scanner.next();
            }
            System.out.println("Некорректный ввод. Пожалуйста, введите корректное число для данного месяца.");
        }

        while (true) {
            System.out.print("Введите часы (0-23): ");
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
                if (hour >= 0 && hour <= 23) break;
            } else {
                scanner.next();
            }
            System.out.println("Некорректный ввод. Пожалуйста, введите целое число от 0 до 23.");
        }

        while (true) {
            System.out.print("Введите минуты (0-59): ");
            if (scanner.hasNextInt()) {
                minute = scanner.nextInt();
                if (minute >= 0 && minute <= 59) break;
            } else {
                scanner.next();
            }
            System.out.println("Некорректный ввод. Пожалуйста, введите целое число от 0 до 59.");
        }

        Date date = new Date(year - 1900, month - 1, day, hour, minute);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);

        System.out.println("Созданный объект Date: " + date);
        System.out.println("Созданный объект Calendar: " + calendar.getTime());
    }

    private static boolean isValidDay(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return day > 0 && day <= cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
