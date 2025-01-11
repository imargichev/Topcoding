package org.example.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }

    public static <chars> int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);


            if (substring.charAt(0) != substring.charAt(1) &&
                    substring.charAt(0) != substring.charAt(2) &&
                    substring.charAt(1) != substring.charAt(2)) {
                count++;
            }
        }

        return count;
    }
}
