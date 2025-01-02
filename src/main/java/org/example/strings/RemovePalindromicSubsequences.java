package org.example.strings;

public class RemovePalindromicSubsequences {
    public static void main(String[] args) {

    }
    public static int removePalindromeSub(String s) {
        // Remove non-alphanumeric characters and convert to lowercase

        s = s.toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)){
            return 1;
        }else {
            return 2;
        }
    }
}
