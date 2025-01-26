package org.example.Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        String s = "aaabb";

        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        Map<Character,Integer> storeChars = new TreeMap<>();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (storeChars.containsKey(currentChar)) {
                storeChars.put(currentChar, storeChars.get(currentChar) + 1);
            } else {
                storeChars.put(currentChar, 1);
            }
        }

        for (int value : storeChars.values()) {
            if (value != storeChars.get(chars[0])) {
                return false;
            }

        }
        return true;
    }
}
