package project.work;

import java.util.LinkedList;

public class WordUtils {
    public static String reverseWords(String inputText) {
        String[] words = inputText.split(" ");
        LinkedList<String> wordList = new LinkedList<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordList.addFirst(word);
            }
        }

            return String.join(" ", wordList);

    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("abc test"));
    }
}

