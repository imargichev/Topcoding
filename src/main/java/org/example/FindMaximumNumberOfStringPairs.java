package org.example;

import java.util.*;

/**
 * This class contains a method to find the maximum number of string pairs in an array.
 */
public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] input = {"cd", "ac", "dc", "ca", "zz"};
        System.out.println(maximumNumberOfStringPairs(input));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int pairs = 0;

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            if (set.contains(reversedWord)) {
                pairs++;
                set.remove(reversedWord);
            } else {
                set.add(word);
            }
        }

        return pairs;
    }
}