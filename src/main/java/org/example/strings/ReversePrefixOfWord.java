package org.example.strings;

public class ReversePrefixOfWord {
    public static void main(String[] args) {

        System.out.println( reversePrefix("abcdefd", 'd'));
    }
    public static String reversePrefix(String word, char ch) {

        StringBuilder  strBldr = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch){
                idx = i+1;
                break;
            }
        }

        strBldr.append(word, 0, idx).reverse();
        strBldr.append(word, idx, word.length());

        return strBldr.toString();
    }
}
