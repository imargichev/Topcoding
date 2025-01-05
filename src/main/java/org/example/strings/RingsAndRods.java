package org.example.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RingsAndRods {
    public static void main(String[] args) {
        String rings = "G7G9R4B0G6R1R9R5B8R4G4B4R6B4B1G2B9G5B6G5";
        System.out.println(countPoints(rings));
    }
    public static int countPoints(String rings) {
        Map<Integer,String> store = new HashMap<>();

        for (int i = 0; i < rings.length(); i+=2) {
            int points = Integer.parseInt(String.valueOf(rings.charAt(i+1)));
            String color = String.valueOf(rings.charAt(i));
            if (store.containsKey(points)) {
                store.put(points, (store.get(points)+color));
            } else {
                store.put(points,color);
            }



        }
        int count = 0;
        for (String value : store.values()) {
            if (value.contains("R") && value.contains("G") && value.contains("B")) {
                count++;
            }
        }
        return count;
}}
