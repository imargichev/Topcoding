package org.example.strings;

public class CountAsterisks {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }
    public static int countAsterisks(String s) {
        int isBalanced = 0;
        int countOfAsterisks = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && isBalanced == 0){
                countOfAsterisks++;
            }
            if (s.charAt(i) == '|' && isBalanced == 0){
                isBalanced++;
            } else if (s.charAt(i) == '|' && isBalanced == 1) {
                isBalanced--;
            }
        }
        return countOfAsterisks;
    }
}
