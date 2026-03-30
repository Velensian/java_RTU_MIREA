package lists_1;

import java.util.Scanner;

class Node2 {
    private String name;
    private int age;
    Node2 next;
    Node2 prev;

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

class DoublyLinkedList {
    private Node2 head;
    private Node2 tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Функция добавления элемента в список
    public void addNode() {
        Node2 node = new Node2();
        node.readAttributes();

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        System.out.println("Элемент добавлен.");
    }

    // Функция удаления элемента из списка
    public void removeNode(int index) {
        if (index < 0 || head == null) {
            System.out.println("Некорректный индекс.");
            return;
        }

        Node2 current = head;
        for (int i = 0; i < index; i++) {
            if (current.next == null) {
                System.out.println("Некорректный индекс.");
                return;
            }
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next; // Удаляем первый элемент
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev; // Удаляем последний элемент
        }

        System.out.println("Элемент удален.");
    }

    // Функция вывода элементов списка на экран
    public void displayNodes() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        Node2 current = head;
        int index = 1;
        while (current != null) {
            System.out.print("Элемент " + index + ": ");
            current.displayAttributes();
            current = current.next;
            index++;
        }
    }

    // Функция очистки списка
    public void clearList() {
        head = null;
        tail = null;
        System.out.println("Список очищен.");
    }

    // Функция проверки списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }
}

public class Pr_2 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
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

