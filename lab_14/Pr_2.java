package lab_14;

import java.util.regex.*;

// 6
public class Pr_2 {
    public static void main(String[] args) {

        String[] emails = {
                "user@example.com",
                "root@localhost",
                "user@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String",
        };

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            if (email.equals("root@localhost") || email.equals("user@localhost")) {
                System.out.println(email + " - допустимый email адрес.");
            } else {
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    System.out.println(email + " - допустимый email адрес.");
                } else {
                    System.out.println(email + " - недопустимый email адрес.");
                }
            }
        }
    }
}


