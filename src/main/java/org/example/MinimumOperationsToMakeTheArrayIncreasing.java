package org.example;

import java.util.Arrays;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        int[] input = {1,1,1};
        System.out.println(minOperations(input));
    }
    public static int minOperations(int[] nums) {
        //Arrays.sort(nums);

        int operations = 0;

        for (int i = 1; i <= nums.length-1; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment; // Увеличаваме nums[i], за да отговаря на условието
                operations += increment; // Отчитаме броя операции
            }
        }
        return operations;
    }
}
