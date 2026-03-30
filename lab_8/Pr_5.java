package lab_8;

import java.util.Scanner;
public class Pr_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите природное число n: ");
        int n = scanner.nextInt();

        // Начинаем с 1
        printNumbers(1, n);

        scanner.close();
    }

    private static void printNumbers(int current, int n) {
        // Базовый случай: если текущее число превышает n, завершить рекурсию
        if (current > n) {
            return;
        }

        // Выводим текущее число
        System.out.println(current);

        // Рекурсивный вызов для следующего числа
        printNumbers(current + 1, n);
    }
}