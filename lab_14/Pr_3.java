package lab_14;

import java.util.Scanner;
import java.util.regex.*;

// 7
public class Pr_3 {

    public static boolean isPasswordSecure(String password) {
        if (password.length() < 8) {
            return false;
        }

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль для проверки: ");
        String password = scanner.nextLine();

        if (isPasswordSecure(password)) {
            System.out.println("Пароль надежный.");
        } else {
            System.out.println("Пароль ненадежный.");
        }
    }
}

