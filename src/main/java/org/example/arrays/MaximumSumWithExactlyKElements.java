package org.example.arrays;

import java.util.Arrays;

/**
 * This class contains a method to maximize the score by performing a specific operation exactly k times.
 * The operation involves selecting an element from the array, removing it, adding a new element with a value
 * of the selected element + 1, and increasing the score by the value of the selected element.
 */
public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5};
        System.out.println(maximizeSum(arr, 2));
    }

    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int maxElement = nums[nums.length - 1];
        for (int i = 0; i < k; i++) {
            sum += maxElement + i;
        }
        return sum;
    }
}