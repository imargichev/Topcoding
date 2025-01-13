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
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentWordCount = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                if (charCount.containsKey(c)) {
                    currentWordCount.put(c, currentWordCount.getOrDefault(c, 0) + 1);
                }
            }
            for (char c : charCount.keySet()) {
                charCount.put(c, Math.min(charCount.get(c), currentWordCount.getOrDefault(c, 0)));
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(String.valueOf(entry.getKey()));
            }
        }

        return result;

    }
}
