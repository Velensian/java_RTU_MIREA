package lab_8;

import java.util.Scanner;

// 15
public class Pr_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Цифры числа " + number + " в обратном порядке:");
        recursion(Math.abs(number));
    }

    public static void recursion(int n) {
        if (n == 0) {
            return;
        }

        System.out.print((n % 10) + " ");
        recursion(n / 10);
    }
}



