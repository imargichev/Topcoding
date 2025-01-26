package org.example.Strings;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
      String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
    public static int minLength(String s) {
            while (s.contains("AB") || s.contains("CD")) {
                s = s.replace("AB", "").replace("CD", "");
            }
        System.out.println(s);
        return s.length();
    }
}
