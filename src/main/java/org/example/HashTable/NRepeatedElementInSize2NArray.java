package org.example.HashTable;

import java.util.TreeMap;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};

        System.out.println(repeatedNTimes(nums));
    }
    public static int repeatedNTimes(int[] nums) {
        int half = nums.length/2;
        int repeated = 0;
        TreeMap<Integer, Integer> frequencyNumbers = new TreeMap<>();

        for (int num : nums) {
            frequencyNumbers.put(num, frequencyNumbers.getOrDefault(num, 0) + 1);
        }

        for(Integer key : frequencyNumbers.keySet()) {
            if(frequencyNumbers.get(key) == half) {
                repeated = key;
            }
        }
        return repeated;
    }
}
