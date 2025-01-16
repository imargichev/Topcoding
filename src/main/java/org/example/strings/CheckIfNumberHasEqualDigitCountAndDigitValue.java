package org.example.strings;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(num);
    }
    public static boolean digitCount(String num) {
        int count = 0;
        int currNumber = 0;

        for (int i = 0; i < num.length(); i++) {
            currNumber = Integer.parseInt(String.valueOf(num.charAt(i)));
            for (int j = 1; j <num.length() ; j++) {
                if (num.equals(String.valueOf(currNumber))){
                    count++;
                }
            }
        }
    }
}
