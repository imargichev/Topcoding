package org.example.HashTable;

import java.util.*;

public class MergeSimilarItemsGTK {
    public static void main(String[] args) {
        int[][] items1 = {
                {1,1},
                {4,5},
                {3,8}};

        int[][] items2 = {
                {3,1},
                {1,5}
        };

        mergeSimilarItems(items1,items2);
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> uniqueNumbersAndKilo = new HashMap<>();

        for (int[] item : items1) {
            uniqueNumbersAndKilo.put(item[0], uniqueNumbersAndKilo.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : items2) {
            uniqueNumbersAndKilo.put(item[0], uniqueNumbersAndKilo.getOrDefault(item[0], 0) + item[1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : new TreeMap<>(uniqueNumbersAndKilo).entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}
