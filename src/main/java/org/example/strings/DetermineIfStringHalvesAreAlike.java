package org.example.strings;
import java.util.Set;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        Set<Character> alphabets = Set.of('a', 'e', 'i', 'o', 'u');
        s = s.toLowerCase();
        int firstCounter = 0,secondCounter = 0;

        for (int firstPart = 0, secondPart = s.length()/2 ; firstPart < s.length()/2; firstPart++, secondPart++) {
            if (alphabets.contains(s.charAt(firstPart))){
                firstCounter++;
            }
            if (alphabets.contains(s.charAt(secondPart))){
                secondCounter++;
            }
        }

        return firstCounter==secondCounter;
    }
}
