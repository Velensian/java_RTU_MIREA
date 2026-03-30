package lab_3;

import java.text.DecimalFormat;

class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-45s %s%n", "Сотрудник:", "Выручка для компании:");
        System.out.println("===================================================================");

        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Переменные для поиска лучшего сотрудника
        Employee bestEmployee = employees[0];

        for (Employee employee : employees) {
            System.out.printf("%-30s %30s%n", employee.getFullname(), df.format(employee.getSalary()));

            // Проверка, является ли текущий сотрудник лучшим
            if (employee.getSalary() > bestEmployee.getSalary()) {
                bestEmployee = employee;
            }
        }

        // Вывод информации о лучшем сотруднике
        System.out.printf("\nЛучший сотрудник: %s", bestEmployee.getFullname());
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Черниогло Сергей Иванович", 233030.15),
                new Employee("Кондратьев Данила Артурович", 141536),
                new Employee("Аниченков Денис Алексеевич", 231768.365),
                new Employee("Одинцов Александр Андреевич", 331768.7)
        };
        generateReport(employees);
    }
}
