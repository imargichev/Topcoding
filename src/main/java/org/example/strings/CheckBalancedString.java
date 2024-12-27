package org.example.strings;

public class CheckBalancedString {
    public static void main(String[] args) {
        String s = "24123";
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num.length(); i++) {
            int number = 0;
            if (i%2 == 0 ){
                odd += Integer.parseInt(String.valueOf(num.charAt(i)));
            }else {
                even += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
        }
        return odd == even;
    }
}
