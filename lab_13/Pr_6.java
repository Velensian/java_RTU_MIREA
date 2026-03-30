package lab_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Pr_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = "C:/Users/sasha/IdeaProjects/Practicum/src/lab_13/" + scanner.nextLine();

        List<String> words = readWordsFromFile(fileName);
        if (words.isEmpty()) {
            System.out.println("Слова не найдены в файле.");
            return;
        }

        String result = getLine(words);
        System.out.println("Результат: " + result);
    }

    private static List<String> readWordsFromFile(String fileName) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitWords = line.split("\s+");
                Collections.addAll(words, splitWords);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return words;
    }

    private static String getLine(List<String> words) {
        Set<String> usedWords = new HashSet<>();
        StringBuilder result = new StringBuilder();

        String currentWord = words.get(0);
        while (currentWord != null) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(currentWord);
            usedWords.add(currentWord);

            currentWord = findNextWord(currentWord, words, usedWords);
        }

        return result.toString();
    }

    private static String findNextWord(String currentWord, List<String> words, Set<String> usedWords) {
        char lastChar = Character.toLowerCase(currentWord.charAt(currentWord.length() - 1));
        for (String word : words) {
            if (!usedWords.contains(word) && Character.toLowerCase(word.charAt(0)) == lastChar) {
                return word;
            }
        }
        return null;
    }
}

