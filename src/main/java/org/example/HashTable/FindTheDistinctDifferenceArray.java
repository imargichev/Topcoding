package org.example.HashTable;

import java.util.HashSet;
import java.util.Set;

public class FindTheDistinctDifferenceArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = distinctDifferenceArray(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        int[] result = new int[nums.length];

        for (int prefix = 0; prefix < nums.length; prefix++) {
            set1.add(nums[prefix]);
            Set<Integer> set2 = new HashSet<>();
            for (int suffix = nums.length-1; suffix > prefix; suffix--) {
                set2.add(nums[suffix]);
            }
        }

        return nums;
    }
}
