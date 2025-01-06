package org.example.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        String s1 = "apple apple", s2 = "banana";
        String[] finalResult = uncommonFromSentences(s1,s2);

        for (String s : finalResult){
            System.out.println(s);
        }

    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        //create map for store;
        Map<String, Integer> wordCount = new HashMap<>();
        //expected result
        List<String> results = new ArrayList<>();

        //here we split the words;
        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");

        for (String word : array1) {
            //for each word in array we put that into hashMap, and we increase the value;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : array2) {
            //for each word in array we put that into hashMap, and we increase the value;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            //check each value if we have only once
            if (entry.getValue() == 1) {
                results.add(entry.getKey());
            }
        }

        return results.toArray(new String[0]);
    }
}
