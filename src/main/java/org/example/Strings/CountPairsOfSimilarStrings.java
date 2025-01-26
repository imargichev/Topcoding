package org.example.Strings;

import java.util.HashSet;
import java.util.Set;

public class CountPairsOfSimilarStrings {
    public static void main(String[] args) {
        String [] words = {"aba","aabb","abcd","bac","aabc"};

    }
    public int similarPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if (checkSimilar(words[i], words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean checkSimilar(String word, String word1) {
        Set<Character> sSet = new HashSet<>();
        for(char ch : word.toCharArray()){
            sSet.add(ch);
        }
        Set<Character> tSet = new HashSet<>();
        for (char ch : word1.toCharArray()){
            tSet.add(ch);
        }
        if (sSet.equals(tSet)){
            return true;
        }
        return false;
    }
}
