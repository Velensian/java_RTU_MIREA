package lab_9;

// 1
class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Имя студента - '" + name + "', Номер студента = " + iDNumber;
    }
}

public class Pr_1 {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student  cicle= students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > cicle.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = cicle;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Анна",  3),
                new Student("Борис", 1),
                new Student("Анастасия", 2),
                new Student("Данила", 5),
                new Student("Илья", 4),
                new Student("Юлия", 7),
                new Student("Мария", 6)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
