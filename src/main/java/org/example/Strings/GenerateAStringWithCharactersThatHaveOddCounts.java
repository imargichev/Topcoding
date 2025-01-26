package org.example.Strings;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(generateTheString(n));
    }
    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        if (n% 2 == 0 ){
            sb.repeat('a',n-1);
            sb.append('b');
        }else {
            sb.repeat('a',n);
        }
        return sb.toString();
    }
}
