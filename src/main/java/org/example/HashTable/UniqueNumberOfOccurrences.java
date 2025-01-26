package org.example.HashTable;

import java.util.*;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int [] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        // Създаване на Map за преброяване на честотите на елементите
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Създаване на Set за проверка на уникалността на честотите
        Set<Integer> frequencySet = new HashSet<>(frequencyMap.values());

        // Ако размерът на множестото и броя на честотите съвпадат, всички са уникални
        return frequencyMap.values().size() == frequencySet.size();

    }
}
