/*
package org.example.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        commonChars(words);
    }
    public static List<String> commonChars(String[] words) {
        Map<Character, Integer> pairChars = new HashMap<>();
        List<String> result = new ArrayList<>();
        int size = words.length;

        for (char c : words[0].toCharArray()) {
            pairChars.put(c, pairChars.getOrDefault(c, 0) + 1);
            int count = pairChars.values().size();
            if (count >= size) {
                result.add(pairChars.k);
            }
        }


        for (int count : pairChars.values()) {
            if (count >= size) {
                result.add(pairChars.k);
            }
        }

        return pairChars.size() == size;


    }
}
*/
