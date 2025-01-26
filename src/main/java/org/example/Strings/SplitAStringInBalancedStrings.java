package org.example.Strings;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
    public static int balancedStringSplit(String s) {
        int alphaCounter = 0;
        int result = 0;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == 'R'){
                alphaCounter++;
            }else if (s.charAt(i) == 'L'){
                alphaCounter--;

            }
            if (alphaCounter == 0) result++;
        }
        return result;
    }
}
