package org.example.strings;

public class ScoreOfAString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i <s.length()-1; i++) {
           char alphabet1  =  s.charAt(i);
           char alphabet2 = s.charAt(i+1);
           sum += Math.abs((int) alphabet1 - (int)alphabet2);

        }
        return sum;
    }
}
