package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class contains a method to find the maximum number of string pairs in an array.
 */
public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] input = {"cd", "ac", "dc", "ca", "zz"};
        System.out.println(maximumNumberOfStringPairs(input));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        ArrayList<String> listOfWordToRemove = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                String temp = words[i].substring(1)+words[i].substring(0);
                if (temp.equals(words[j])){
                    counter++;
                    String[] uniqueWords = Arrays.stream(words)
                            .distinct()
                            .toArray(String[]::new);
                }
            }
        }
        return counter;
    }
}