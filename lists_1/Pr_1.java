package lists_1;

import java.util.ArrayList;
import java.util.Scanner;

class Node1 {
    private String name;
    private int age;

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();

        while (true) {
            System.out.print("Введите возраст (целое число): ");
            if (scanner.hasNextInt()) {
                this.age = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка: введено не целое число. Пожалуйста, попробуйте снова.");
                scanner.next();
            }
        }
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

class List {
    private ArrayList<Node1> nodes;

    // Конструктор для создания пустого списка
    public List() {
        nodes = new ArrayList<>();
    }

    // Функция добавления элемента в список
    public void addNode() {
        Node1 node = new Node1();
        node.readAttributes();
        nodes.add(node);
    }

    // Функция удаления элемента из списка
    public void removeNode(int index) {
        if (index >= 0 && index < nodes.size()) {
            nodes.remove(index);
            System.out.println("Элемент удален.");
        } else {
            System.out.println("Некорректный индекс.");
        }
    }

    // Функция вывода элементов списка на экран
    public void displayNodes() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (int i = 0; i < nodes.size(); i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            nodes.get(i).displayAttributes();
        }
    }

    // Функция очистки списка
    public void clearList() {
        nodes.clear();
        System.out.println("Список очищен.");
    }

    // Функция проверки списка на пустоту
    public boolean isEmpty() {
        return nodes.isEmpty();
    }
}

public class Pr_1 {
    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Вывести элементы");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить, пуст ли список");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    list.addNode();
                    break;
                case "2":
                    System.out.print("Введите индекс элемента для удаления: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine()) - 1;
                        list.removeNode(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: введено некорректное значение для индекса.");
                    }
                    break;
                case "3":
                    list.displayNodes();
                    break;
                case "4":
                    list.clearList();
                    break;
                case "5":
                    if (list.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        System.out.println("Список не пуст.");
                    }
                    break;
                case "0":
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор, попробуйте еще раз.");
            }
        } while (!choice.equals("0"));

        scanner.close();
    }
}
