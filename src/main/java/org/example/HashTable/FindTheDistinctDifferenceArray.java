package org.example.HashTable;

import java.util.HashSet;
import java.util.Set;

public class FindTheDistinctDifferenceArray {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4,2};
        int[] result = distinctDifferenceArray(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        Set<Integer> prefixSet = new HashSet<>();
        Set<Integer> suffixSet = new HashSet<>();

        for (int i = 1; i < n; i++) {
            suffixSet.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = prefixSet.size() - suffixSet.size();
            prefixSet.add(nums[i]);
            suffixSet.remove(nums[i]);
        }

        return result;

    }
}
