package lists_2;

// 11
class Node2 {
    int value;
    Node2 next;

    Node2(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node2 head;

    public void add(int value) {
        if (head == null) {
            head = new Node2(value);
        } else {
            Node2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node2(value);
        }
    }

    public Node2 sort(Node2 head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node2 lessHead = null; // Список для элементов меньше первого
        Node2 greaterHead = null; // Список для элементов больше или равным первому

        Node2 current = head.next;
        while (current != null) {
            if (current.value < head.value) {
                lessHead = append(lessHead, current.value);
            } else {
                greaterHead = append(greaterHead, current.value);
            }
            current = current.next;
        }

        lessHead = sort(lessHead);
        greaterHead = sort(greaterHead);

        return concatenate(lessHead, head, greaterHead);
    }

    private Node2 append(Node2 head, int value) {
        if (head == null) {
            return new Node2(value);
        } else {
            Node2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node2(value);
            return head;
        }
    }

    // Метод для объединения трех списков
    private Node2 concatenate(Node2 less, Node2 pivot, Node2 greater) {
        if (less == null) {
            pivot.next = greater;
            return pivot;
        }

        Node2 current = less;
        while (current.next != null) {
            current = current.next;
        }
        current.next = pivot;
        pivot.next = greater;

        return less;
    }

    public void printList() {
        Node2 current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void sort() {
        head = sort(head);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        System.out.println("Исходный список:");
        list.printList();

        list.sort();

        System.out.println("Отсортированный список:");
        list.printList();
    }
}

