package org.example.Strings;

public class PercentageOfLetterInString {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s,letter));
    }
    public static int percentageLetter(String s, char letter) {
        int count = 0;
        int length = s.length();

        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }

        return (int) Math.floor((count / (double) length) * 100);
    }
}
