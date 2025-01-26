package org.example.HashTable;

import java.util.Objects;
import java.util.TreeMap;

public class CountElementsWithMaximumFrequencyTOP {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        TreeMap<Integer, Integer> frequencyNumbers = new TreeMap<>();

        for (int num : nums) {
            frequencyNumbers.put(num, frequencyNumbers.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = frequencyNumbers.values().stream().max(Integer::compare).orElse(0);

        int result = (int) frequencyNumbers.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), maxFrequency))
                .count();

        return result;

    }
}
