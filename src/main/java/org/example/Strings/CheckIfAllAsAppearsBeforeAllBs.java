package org.example.Strings;

import java.util.Arrays;

public class CheckIfAllAsAppearsBeforeAllBs {
    public static void main(String[] args) {
       String s = "aaabbb";
        System.out.println(checkString(s));
    }
    public static boolean checkString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!= s.charAt(i)){
                return false;
            }
        }

        return true;

    }
}
