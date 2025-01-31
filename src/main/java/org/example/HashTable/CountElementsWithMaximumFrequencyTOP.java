package org.example.HashTable;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class CountElementsWithMaximumFrequencyTOP {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        TreeMap<Integer, Integer> frequencyNumbers = new TreeMap<>();
        int maxFrequency = 0;
        int totalCount = 0;

        for (int num : nums) {
            int freq = frequencyNumbers.getOrDefault(num, 0) + 1;
            frequencyNumbers.put(num, freq);

            if (freq > maxFrequency) {
                maxFrequency = freq;
                totalCount = freq;
            } else if (freq == maxFrequency) {
                totalCount += freq;
            }
        }

        return totalCount;
    }
}
