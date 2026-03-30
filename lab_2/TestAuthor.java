package lab_2;

// 1
public class TestAuthor {
    public static void main(String[] args) {
        Author Qwerty = new Author("Qwerty", "qwerty@gmail.com", 'M');
        Author Ytrewq = new Author("Ytrewq", "ytrewq@gmail.com", 'W');
        System.out.println(Qwerty.toString());
        System.out.println(Ytrewq.toString());
        Qwerty.setEmail("12312321@gmail.com");
        System.out.println(Qwerty.toString());
    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}