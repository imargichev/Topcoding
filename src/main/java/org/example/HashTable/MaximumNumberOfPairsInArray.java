package org.example.HashTable;

import java.util.*;

public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        int[] nums = {5,12,53,22,7,59,41,54,71,24,91,74,62,47,20,14,73,11,82,2,15,38,38,20,57,70,86,93,38,75,94,19,36,40,28,6,35,86,38,94,4,90,18,87,24,22};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> frequencyNumbers = new HashMap<>();
        for (int num : nums) {
            frequencyNumbers.put(num, frequencyNumbers.getOrDefault(num, 0) + 1);
        }

        int numClearPairs = 0;
        int numsNotInPairs = 0;

        for (int count : frequencyNumbers.values()) {
            numClearPairs += count / 2;
            numsNotInPairs += count % 2;
        }

        return new int[]{numClearPairs, numsNotInPairs};
    }
}
