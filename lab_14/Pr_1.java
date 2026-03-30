package lab_14;

import java.util.regex.*;

// 2
public class Pr_1 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String input1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String input2 = "abcdefghijklmnopqrstuv18340";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(input1);
        Matcher matcher2 = pattern.matcher(input2);

        if (matcher1.matches()) {
            System.out.println("Строка 1 является правильной.");
        } else {
            System.out.println("Строка 1 является неправильной.");
        }
        if (matcher2.matches()) {
            System.out.println("Строка 2 является правильной.");
        } else {
            System.out.println("Строка 2 является неправильной.");
        }
    }
}

