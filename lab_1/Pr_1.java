package lab_1;

import java.util.Random;
import java.util.Arrays;

// 3
public class Pr_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[(int) (random.nextInt(10))];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random.nextInt(100));
            sum += array[i];
        }
        double sr = (double) sum / array.length;
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Cреднее арифметическое элементов: " + sr);
    }
}
