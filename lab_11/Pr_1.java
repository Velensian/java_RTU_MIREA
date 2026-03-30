package lab_11;

import java.util.Date;

// 1
public class Pr_1 {
    public static void main(String[] args) {
        String developerSurname = "Иванов";

        Date dateReceived = new Date();

        try {
            Thread.sleep(1000); // Задержка на 1 секунды
        } catch (InterruptedException e) {}

        Date dateSubmitted = new Date();

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}


