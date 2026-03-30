package lab_7;

// 5
interface StringOperations {
    int countCharacters(String s);
    String oddPositionCharacters(String s);
    String reverseString(String s);
}

class StringManipulator implements StringOperations {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String oddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i+=2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

public class    Pr_2 {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String testString = "Abeme, Wow!";

        System.out.println("Количество символов: " + manipulator.countCharacters(testString));
        System.out.println("Символы на нечетных позициях: " + manipulator.oddPositionCharacters(testString));
        System.out.println("Инвертированная строка: " + manipulator.reverseString(testString));
    }
}

