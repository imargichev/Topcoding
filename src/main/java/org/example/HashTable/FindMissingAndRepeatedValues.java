package org.example.HashTable;

import java.util.Map;
import java.util.TreeMap;

public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {1,3},
                {2,2}};

        int[] finalResult = findMissingAndRepeatedValues(grid);
        for (int i = 0; i <finalResult.length ; i++) {
            System.out.println(finalResult[i]);
        }
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        TreeMap<Integer, Integer> allNumbersInMap = new TreeMap<>();
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                allNumbersInMap.put(grid[i][j], allNumbersInMap.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        int[] result = new int[2];
        for (int i = 1; i <= n * n; i++) {
            if (!allNumbersInMap.containsKey(i)) {
                result[1] = i;
            } else if (allNumbersInMap.get(i) == 2) {
                result[0] = i;
            }
        }

        return result;

    }
}
