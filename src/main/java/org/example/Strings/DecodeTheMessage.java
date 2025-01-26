package org.example.Strings;

import java.util.HashMap;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));
    }
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> substitutionTable = new HashMap<>();
        char currentChar = 'a';

        for (char c : key.toCharArray()) {
            if (c != ' ' && !substitutionTable.containsKey(c)) {
                substitutionTable.put(c, currentChar++);
            }
        }

        StringBuilder decodedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                decodedMessage.append(' ');
            } else {
                decodedMessage.append(substitutionTable.get(c));
            }
        }

        return decodedMessage.toString();

}}
