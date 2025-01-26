package org.example.Strings;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(makeSmallestPalindrome(s));
    }
    public static String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != chars[n - i - 1]) {
                if (chars[i] < chars[n - i - 1]) {
                    chars[n - i - 1] = chars[i];
                } else {
                    chars[i] = chars[n - i - 1];
                }
            }
        }
        return new String(chars);
    }
}
