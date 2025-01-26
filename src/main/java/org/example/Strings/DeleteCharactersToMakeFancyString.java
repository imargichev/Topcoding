package org.example.Strings;

public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        String s = "aaabaaaa";
        System.out.println(makeFancyString(s));

    }
    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                sb.append(s.charAt(i - 1));
            }
        }
        if (!s.isEmpty()) {
            sb.append(s.charAt(s.length() - 1));
        }

        return sb.toString();
    }
}
