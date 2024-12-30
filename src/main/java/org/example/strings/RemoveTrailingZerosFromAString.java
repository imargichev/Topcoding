package org.example.strings;

public class RemoveTrailingZerosFromAString {
    public static void main(String[] args) {
        String num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }
    public static String removeTrailingZeros(String num) {
        while (num.endsWith("0")) {
            num = num.substring(0, num.length() - 1);
        }
        return num;
    }
}
