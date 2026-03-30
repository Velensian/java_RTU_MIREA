package lists_2;

// 5
class Node {
    private int[] data; // Массив из 5 целых переменных
    private int count;  // Количество заполненных элементов
    private Node next;

    public Node() {
        data = new int[5];
        count = 0;
        next = null;
    }

    public boolean insert(int value) {
        if (count < 5) {
            int i;
            for (i = count - 1; (i >= 0 && data[i] > value); i--) {
                data[i + 1] = data[i];
            }
            data[i + 1] = value;
            count++;
            return true;
        }
        return false;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public int getCount() {
        return count;
    }

    public int[] getData() {
        return data;
    }
}

class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public void insert(int value) {
        if (head == null) {
            head = new Node();
            head.insert(value);
        } else {
            Node current = head;
            while (current != null) {
                if (current.insert(value)) {
                    return;
                }
                if (current.getNext() == null) {
                    current.setNext(new Node());
                }
                current = current.getNext();
            }
        }
    }

    public void display() {
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.print(index + ": [");
            for (int i = 0; i < current.getCount(); i++) {
                System.out.print(current.getData()[i]);
                if (i < current.getCount() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            index++;
            current = current.getNext();
        }
    }
}

public class Pr_1 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(3);
        list.insert(1);
        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        System.out.println("Содержимое списка:");
        list.display();
    }
}

