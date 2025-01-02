package org.example.strings;

import java.util.Map;
import java.util.TreeMap;

public class MinimizeStringLength {
    public static void main(String[] args) {
        String s = "baadccab";
        System.out.println(minimizedStringLength(s));
    }
    public static int minimizedStringLength(String s) {
        Map<Character,Integer> storeChars = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (storeChars.containsKey(currentChar)) {
                storeChars.put(currentChar, storeChars.get(currentChar) + 1);
            } else {
                storeChars.put(currentChar, 1);
            }
        }
        int counter = 0;
        for(Map.Entry<Character, Integer> c : storeChars.entrySet()){
            if (c.getValue() <=1){
                storeChars.put(c.getKey(), c.getValue() - 1);
                counter++;
            }
        }
        return s.length() - counter;
    }
}
