package org.example.strings;

public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        String s = "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }
    public static String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int countOfOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') countOfOnes++;
        }

        for (int i = 0; i < countOfOnes - 1; i++) {
            sb.append('1');
        }

        for (char c : s.toCharArray()) {
            if (c == '0') {
                sb.append('0');
            }
        }

        sb.append('1');

        return sb.toString();
    }
}
