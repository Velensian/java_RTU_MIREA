package lab_1;

import java.util.Scanner;

// 7
public class Pr_5 {

    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n! = ?   n = ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Ошибка! Некорректные данные.");
            System.exit(0);
        }
        System.out.println("Факториал: " + factorial(n));
    }
}
