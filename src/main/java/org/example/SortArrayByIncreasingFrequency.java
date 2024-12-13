package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(arr)));

    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Convert the array to a list of Integer
        Integer[] numsArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Sort the array by frequency and then by value
        Arrays.sort(numsArray, (a, b) -> {
            int freqCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
            return freqCompare == 0 ? a.compareTo(b) : freqCompare;
        });

        // Convert the list back to an array of int
        return Arrays.stream(numsArray).mapToInt(Integer::intValue).toArray();}
}
