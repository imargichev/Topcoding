package org.example.HashTable;

import java.util.Hashtable;

public class FindTheXOROfNumbersWhichAppearTwice {
    public static void main(String[] args) {
        int [] nums = {1,2,2,1};
        System.out.println(duplicateNumbersXOR(nums));
    }
    public static int duplicateNumbersXOR(int[] nums) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int num : nums) {
            if (hashtable.containsKey(num)) {
                hashtable.put(num, hashtable.get(num) + 1);
            } else {
                hashtable.put(num, 1);
            }
        }
        int result = 0;
        for (int key : hashtable.keySet()) {
            if (hashtable.get(key) == 2) {
                result ^= key;
            }
        }
        return result;
    }
}
