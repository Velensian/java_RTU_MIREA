package lab_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// 3
public class Pr_3 {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private Calendar birthDate;

    public Pr_3(String firstName, String lastName, String specialty, int course, String group, Calendar birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate.getTime());
    }

    public String getStandardFormattedBirthDate(String formatType) {
        String format;
        switch (formatType.toLowerCase()) {
            case "short":
                format = "dd/MM/yy";
                break;
            case "medium":
                format = "dd MMM yyyy";
                break;
            case "long":
                format = "dd MMMM yyyy";
                break;
            default:
                throw new IllegalArgumentException("Неверный тип формата: " + formatType);
        }
        return getFormattedBirthDate(format);
    }

    @Override
    public String toString() {
        return "Студент" + '\'' +
                ", Имя ='" + firstName + '\'' +
                ", Фамилия ='" + lastName + '\'' +
                ", Специальность ='" + specialty + '\'' +
                ", Курс =" + course +
                ", Группа ='" + group + '\'' +
                ", Дата рождения =" + getFormattedBirthDate("dd-MM-yyyy");
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Calendar birthDate = new GregorianCalendar();
            birthDate.setTime(sdf.parse("15-04-2000"));

            Pr_3 student = new Pr_3("Иван", "Иванов", "Информатика", 2, "Группа 1", birthDate);
            System.out.println(student);

            System.out.println("Короткий формат: " + student.getStandardFormattedBirthDate("short"));
            System.out.println("Средний формат: " + student.getStandardFormattedBirthDate("medium"));
            System.out.println("Полный формат: " + student.getStandardFormattedBirthDate("long"));

        } catch (ParseException e) {
            System.out.println("Неверный формат даты рождения.");
        }
    }
}
