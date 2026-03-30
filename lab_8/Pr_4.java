package lab_8;

import java.util.Scanner;

public class Pr_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n (не должно содержать нулей): ");
        int n = scanner.nextInt();

        // Проверка, что число не содержит нулей и больше 0
        if (n <= 0 || String.valueOf(n).contains("0")) {
            System.out.println("Введите корректное число, не содержащее нулей.");
        } else {
            int reversed = reverse(n);
            System.out.println("Разворот числа: " + reversed);
        }

        scanner.close();
    }

    private static int reverse(int n) {
        // Базовый случай: если число равно 0, возвращаем 0
        if (n == 0) {
            return 0;
        }
        // Получаем последнюю цифру
        int lastDigit = n % 10;
        // Получаем оставшуюся часть числа
        int remaining = n / 10;

        // Рекурсивный вызов и формирование результирующего числа
        return lastDigit * (int) Math.pow(10, (int) Math.log10(n)) + reverse(remaining);
    }
}