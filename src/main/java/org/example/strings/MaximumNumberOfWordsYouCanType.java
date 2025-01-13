package org.example.strings;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {
      String text = "hello world", brokenLetters = "ad";
        System.out.println(canBeTypedWords(text,brokenLetters));
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        String [] words = text.split("\\s+");
        Set<Character> setOfBrokenLetters = new HashSet<>();

        for (int i = 0; i < brokenLetters.length(); i++) {
            setOfBrokenLetters.add( brokenLetters.charAt(i));
        }

        int count = words.length;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (setOfBrokenLetters.contains(words[i].charAt(j))){
                    count--;
                    break;
                }
            }

        }
        return count;
    }
}
