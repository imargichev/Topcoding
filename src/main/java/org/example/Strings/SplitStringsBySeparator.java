package org.example.Strings;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");
        char separator = '.';
        System.out.println(splitWordsBySeparator(words, separator));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        String separatorStr = "\\" + separator; // Escape the separator for regex
        for (String word : words) {
            String[] splitWords = word.split(separatorStr);
            for (String splitWord : splitWords) {
                if (!splitWord.isEmpty()) {
                    result.add(splitWord);
                }
            }
        }
        return result;
    }
}
