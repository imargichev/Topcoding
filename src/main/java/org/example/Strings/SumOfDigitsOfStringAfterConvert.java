package org.example.Strings;

public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        String s = "zbax";
        int k = 1;
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        int sum = 0;

        for (int i = 0; i < sb.length(); i++) {
           sum += Integer.parseInt(String.valueOf(sb.charAt(i)));
        }

        String prePreResult = Integer.toString(sum);

        int lastSum = 0;

        for (int i = 0; i < prePreResult.length(); i++) {
            lastSum += Integer.parseInt(String.valueOf(prePreResult.charAt(i)));
        }

        return lastSum;

    }
}
