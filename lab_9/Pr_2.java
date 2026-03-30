import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 2
class Student {
    String name;
    double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) < 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }
}

public class Pr_2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Анна", 3.5));
        students.add(new Student("Борис", 3.8));
        students.add(new Student("Анастасия", 4.9));
        students.add(new Student("Данила", 3.2));
        students.add(new Student("Илья", 3.5));
        students.add(new Student("Юлия", 3.9));
        students.add(new Student("Мария", 4.3));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);
        System.out.println("Отсортированный список студентов по Gpa:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
