package org.example.Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {

        if (s == null || s.isEmpty()) {
            return ' ';
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            if (charCount.get(c) == 2) {
                return c;
            }
        }
        return ' ';
    }
}
