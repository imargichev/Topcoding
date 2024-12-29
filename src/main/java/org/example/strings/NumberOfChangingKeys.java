package org.example.strings;

public class NumberOfChangingKeys {
    public static void main(String[] args) {
     String s = "aAbBcC";
     System.out.println(countKeyChanges(s));
    }
    public static int countKeyChanges(String s) {
        s = s.toLowerCase();
        int countOfDiffAlphas = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1)!=s.charAt(i)){
                countOfDiffAlphas++;
            }
        }
        return countOfDiffAlphas;
    }
}
