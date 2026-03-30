package lab_8;

import java.util.Scanner;

// 16
public class Pr_1 {

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел, которое заканчивается 0 (каждое число на отдельной строчке):");
        int[] result = recursion(Integer.MIN_VALUE, 0);
        System.out.println("Максимальное число: " + result[0]);
        System.out.println("Количество вхождений: " + result[1]);
    }

    public static int[] recursion(int max, int count) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            return new int[]{max, count};
        }

        if (number > max) {
            max = number;
            count = 1;
        } else if (number == max) {
            count++;
        }

        return recursion(max, count);
    }
}

