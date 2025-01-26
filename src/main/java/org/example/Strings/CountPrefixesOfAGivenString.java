package org.example.Strings;

import java.util.ArrayList;

public class CountPrefixesOfAGivenString {
    public static void main(String[] args) {
        String [] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(words,s));

    }
    public static int countPrefixes(String[] words, String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> allCombo = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            allCombo.add(sb.toString());
        }

        for(String str : words){
            if (allCombo.contains(str)){
                count++;
            }
        }

        return count;
    }
}
