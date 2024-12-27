package org.example.strings;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            sortedWords[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", sortedWords);
    }
}
