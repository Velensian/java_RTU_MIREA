package lab_1;

import java.util.Scanner;
import java.util.Arrays;

// 4
public class Pr_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = sc.nextInt();
        if (length < 0) {
            System.out.println("Ошибка! Некорректные данные.");
            System.exit(0);
        }
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        int i = 0;
        while (i < length) {
            sum += array[i];
            i++;
        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
