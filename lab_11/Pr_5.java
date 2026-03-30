package lab_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 5
public class Pr_5 {
    public static void main(String[] args) {
        final int SIZE = 100000;

        System.out.println("Вставка в конец:");

        long startTime1 = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }
        long endTime1 = System.nanoTime();
        System.out.println("ArrayList: " + (endTime1 - startTime1) + " нс");

        long startTime2 = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }
        long endTime2 = System.nanoTime();
        System.out.println("LinkedList: " + (endTime2 - startTime2) + " нс");

        System.out.println("Разница: " + ((endTime1 - startTime1) - (endTime2 - startTime2)) + " нс");

        System.out.println("\nУдаление из начала:");

        startTime1 = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            arrayList.remove(0);
        }
        endTime1 = System.nanoTime();
        System.out.println("ArrayList: " + (endTime1 - startTime1) + " нс");


        startTime2 = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            linkedList.remove(0);
        }
        endTime2 = System.nanoTime();
        System.out.println("LinkedList: " + (endTime2 - startTime2) + " нс");

        System.out.println("Разница: " + ((endTime1 - startTime1) - (endTime2 - startTime2)) + " нс");

        System.out.println("\nПоиск:");

        int searchElement = SIZE / 2;

        startTime1 = System.nanoTime();
        arrayList.contains(searchElement);
        endTime1 = System.nanoTime();
        System.out.println("ArrayList: " + (endTime1 - startTime1) + " нс");

        startTime2 = System.nanoTime();
        linkedList.contains(searchElement);
        endTime2 = System.nanoTime();
        System.out.println("LinkedList: " + (endTime2 - startTime2) + " нс");

        System.out.println("Разница: " + ((endTime1 - startTime1) - (endTime2 - startTime2)) + " нс");
    }
}

