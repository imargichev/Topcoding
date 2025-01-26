package org.example.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));
    }

    public static String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        TreeMap<Character, Integer> sorterChars = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            sorterChars.put(s.charAt(i), sorterChars.getOrDefault(s.charAt(i), 0) + 1);
        }

        while (!sorterChars.isEmpty()) {
            List<Character> keys = new ArrayList<>(sorterChars.keySet());
            for (char key : keys) {
                sb.append(key);
                sorterChars.put(key, sorterChars.get(key) - 1);
                if (sorterChars.get(key) == 0) {
                    sorterChars.remove(key);
                }
            }

            List<Character> descendingKeys = new ArrayList<>(sorterChars.descendingKeySet());
            for (char key : descendingKeys) {
                sb.append(key);
                sorterChars.put(key, sorterChars.get(key) - 1);
                if (sorterChars.get(key) == 0) {
                    sorterChars.remove(key);
                }
            }
        }
        return sb.toString();
    }
}