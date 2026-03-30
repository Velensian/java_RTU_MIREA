package lab_8;

import java.util.Scanner;

// 5
public class Pr_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Сумма цифр числа " + number + " равна " + recursion(Math.abs(number)));
    }

    public static int recursion(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + recursion(n / 10);
    }
}

