package lab_3;

import java.util.*;


public class Task_1_1 {
    public static void main(String[] args) {
        int length = 10;
        Double[] arr = new Double[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Math.random();
        }

        System.out.println("Не сортированный: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Отсортированный: ");
        System.out.println(Arrays.toString(arr));

        Double[] arr_2 = new Double[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            arr_2[i] = rand.nextDouble(10);
        }
        System.out.println("\nНе сортированный с классом Random: ");
        System.out.println(Arrays.toString(arr_2));
        Arrays.sort(arr_2);
        System.out.println("Сортированный с классом Random: ");
        System.out.println(Arrays.toString(arr_2));
    }
}