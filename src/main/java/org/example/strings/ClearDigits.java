package org.example.strings;

public class ClearDigits {
    public static void main(String[] args) {
        String s = "cb34";
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                // Премахни текущата цифра и символа вляво (ако има)
                if (i > 0) {
                    sb.delete(i - 1, i + 1); // Премахва два символа
                    i -= 2; // Коригирай индекса след премахване
                } else {
                    sb.deleteCharAt(i); // Премахва само цифрата
                    i--; // Коригирай индекса
                }
            }
        }

        return sb.toString();
    }
}
