package lab_11;

import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// 2
public class Pr_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");

        Calendar currentCalendar = Calendar.getInstance();
        // Устанавливаем время на 00:00:00 для текущей даты
        currentCalendar.set(Calendar.HOUR_OF_DAY, 0);
        currentCalendar.set(Calendar.MINUTE, 0);
        currentCalendar.set(Calendar.SECOND, 0);
        currentCalendar.set(Calendar.MILLISECOND, 0);
        System.out.println("Текущая дата: " + sdf.format(currentCalendar.getTime()));

        System.out.print("Введите дату (ГГГГ ММ ДД): ");
        String userInput = scanner.nextLine();

        try {
            Calendar userCalendar = Calendar.getInstance();
            userCalendar.setTime(sdf.parse(userInput));
            // Устанавливаем время на 00:00:00 для текущей даты
            currentCalendar.set(Calendar.HOUR_OF_DAY, 0);
            currentCalendar.set(Calendar.MINUTE, 0);
            currentCalendar.set(Calendar.SECOND, 0);
            currentCalendar.set(Calendar.MILLISECOND, 0);

            if (userCalendar.before(currentCalendar)) {
                System.out.println("Введенная дата раньше текущей.");
            } else if (userCalendar.after(currentCalendar)) {
                System.out.println("Введенная дата позже текущей.");
            } else {
                System.out.println("Введенная дата совпадают с текущей.");
            }
        } catch (ParseException e) {
            System.out.println("Неверный формат даты. Пожалуйста, используйте формат ГГГГ ММ ДД.");
        }
    }
}

