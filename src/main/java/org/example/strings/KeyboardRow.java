package org.example.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class KeyboardRow {
    public static void main(String[] args) {
        String [] words = {"Hello","Alaska","Dad","Peace"};
        findWords(words);
    }
    public static String[] findWords(String[] words) {
        Set<Character> firstRow = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> secondRow = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> thirdRow = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

        ArrayList<String> resultStringOfWordInOneRow = new ArrayList();

        int countInFirstRow = 0;
        int countInSecondRow = 0;
        int countInThirdRow= 0;

        for (String s : words){
            String lowerCaseWord = s.toLowerCase();
            for (char c : lowerCaseWord.toCharArray()){
                if (firstRow.contains(c)){
                    countInFirstRow++;
                } else if (secondRow.contains(c)) {
                    countInSecondRow++;
                } else if (thirdRow.contains(c)) {
                    countInThirdRow++;
                }
            }
            if (countInFirstRow > 0 && countInSecondRow == 0 && countInThirdRow == 0){
                resultStringOfWordInOneRow.add(s);
            }if (countInSecondRow > 0 && countInFirstRow == 0 && countInThirdRow == 0){
                resultStringOfWordInOneRow.add(s);
            }if (countInThirdRow > 0 && countInSecondRow == 0 && countInFirstRow == 0){
                resultStringOfWordInOneRow.add(s);
            }
            countInFirstRow = 0;
            countInSecondRow = 0;
            countInThirdRow = 0;
        }
        return resultStringOfWordInOneRow.toArray(new String[0]);
    }
}
