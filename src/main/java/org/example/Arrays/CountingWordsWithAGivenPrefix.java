package org.example.Arrays;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        String [] words = {"pay","attention","practice","attend"};
        String pref = "at";


    }
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
