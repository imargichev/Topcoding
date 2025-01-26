package org.example.Strings;

import java.util.*;

public class MinimizeStringLength {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(minimizedStringLength(s));
    }
    public static int minimizedStringLength(String s) {
        char[] chars = s.toCharArray();

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : chars) {
            uniqueChars.add(c);
        }

        return uniqueChars.size();
    }
}
