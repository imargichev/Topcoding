package org.example.strings;

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
    }
    public static String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                char newChar = (char) (s.charAt(i - 1) + Character.getNumericValue(s.charAt(i)));
                result.append(newChar);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
