package org.example.strings;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfVowelStringsInRange {
    public static void main(String[] args) {
        String words [] = {"are","amy","u"};
        int left = 0;
        int right = 2;

        System.out.println(vowelStrings(words,left,right));
    }
    public static int vowelStrings(String[] words, int left, int right) {
        Set<Character> vowelChars = Set.of('a', 'e', 'i', 'o', 'u');
        int result = 0;

        for (int i = left; i <= right; i++) {
            if (vowelChars.contains(words[i].charAt(0)) && vowelChars.contains(words[i].charAt(words[i].length()-1))){
                result++;
            }
        }

        return result;

    }
}
