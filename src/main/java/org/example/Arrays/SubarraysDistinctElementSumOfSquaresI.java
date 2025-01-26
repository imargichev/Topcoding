package org.example.Arrays;

import java.util.*;

public class SubarraysDistinctElementSumOfSquaresI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1);
        int sortedArr = frequencySort(list);
        System.out.println(sortedArr);
    }

    public static int frequencySort(List<Integer> nums) {
        int n = nums.size();
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> distinctElements = new HashSet<>();
            for (int j = i; j < n; j++) {
                distinctElements.add(nums.get(j));
                int distinctCount = distinctElements.size();
                totalSum += distinctCount * distinctCount;
            }
        }

        return totalSum;
    }
}