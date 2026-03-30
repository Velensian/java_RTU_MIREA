package lab_13;

// 1
public class Pr_1 {

    public static void main(String[] args) {
        // 1.
        String input = "I like Java!!!";
        printString(input);

        // 2. Распечатать последний символ строки
        System.out.println("Последний символ: " + input.charAt(input.length() - 1));

        // 3. Проверить, заканчивается ли строка подстрокой "!!!"
        System.out.println("Заканчивается на '!!!': " + input.endsWith("!!!"));

        // 4. Проверить, начинается ли строка подстрокой "I like"
        System.out.println("Начинается на 'I like': " + input.startsWith("I like"));

        // 5. Проверить, содержит ли строка подстроку "Java"
        System.out.println("Содержит 'Java': " + input.contains("Java"));

        // 6. Найти позицию подстроки "Java"
        int positionOfJava = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + positionOfJava);

        // 7. Заменить все символы "а" на "о"
        System.out.println("Строка после замены 'а' на 'о': " + input.replace('a', 'o'));

        // 8. Преобразовать строку к верхнему регистру
        System.out.println("Строка в верхнем регистре: " + input.toUpperCase());

        // 9. Преобразовать строку к нижнему регистру
        System.out.println("Строка в нижнем регистре: " + input.toLowerCase());

        // 10. Вырезать строку "Java" с помощью метода String.substring()
        String substringJava = input.substring(positionOfJava, positionOfJava + "Java".length());
        System.out.println("Вырезанная строка: " + substringJava);
    }

    // 1.
    public static void printString(String input) {
        System.out.println("Изначальная строка: " + input);
    }
}
