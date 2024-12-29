package org.example.strings;

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {
        String s = "abcde", t = "edbac";
        System.out.println(findPermutationDifference(s,t));
    }
    public static int findPermutationDifference(String s, String t) {
        int indexOfFirstChar = 0;
        int indexOfSecondChar = 0;
        int result = 0;
        for (int i = 0; i <s.length(); i++) {
            char currChar = s.charAt(i);
            indexOfFirstChar = i;
            indexOfSecondChar = t.indexOf(currChar);

            result += Math.abs(indexOfFirstChar - indexOfSecondChar);
        }
        return result;
    }
}
