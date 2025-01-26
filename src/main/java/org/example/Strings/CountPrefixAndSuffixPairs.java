package org.example.Strings;

public class CountPrefixAndSuffixPairs {
    public static void main(String[] args) {
        String [] words = {"abab","ab"};
        System.out.println(countPrefixSuffixPairs(words));
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].startsWith(words[i]) && words[j].endsWith(words[i]) && !words[j].equals(words[i])) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
