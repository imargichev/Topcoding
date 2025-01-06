package org.example.strings;

import java.util.ArrayList;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        String[] finalResult = uncommonFromSentences(s1,s2);

        for (String s : finalResult){
            System.out.println(s);
        }

    }
    public static String[] uncommonFromSentences(String s1, String s2) {

        List<String> results = new ArrayList<>();

        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");

        for (int i = 0; i < array1.length ; i++) {
            if (!s1.contains(array2[i])){
                results.add(array2[i]);
            }
        }
        for (int i = 0; i < array1.length ; i++) {
            if (!s2.contains(array1[i])){
                results.add(array1[i]);
            }
        }

       return
    }
}
