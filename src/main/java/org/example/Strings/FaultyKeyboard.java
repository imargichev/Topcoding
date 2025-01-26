package org.example.Strings;

public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "string";
        System.out.println(finalString(s));
    }
    public static String finalString(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'i') {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
