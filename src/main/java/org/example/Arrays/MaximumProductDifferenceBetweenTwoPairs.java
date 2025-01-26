package org.example.Arrays;

import java.util.Arrays;

/**
 * This class provides a method to find the maximum product difference between two pairs in an array.
 */
public class MaximumProductDifferenceBetweenTwoPairs {
    /**
     * Main method to test the maxProductDifference function.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }

    /**
     * Finds the maximum product difference between two pairs in the given array.
     *
     * The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
     * The function sorts the array and selects the two largest and two smallest numbers to maximize the product difference.
     *
     * @param nums The integer array to find the maximum product difference
     * @return The maximum product difference between two pairs
     */
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int w = nums[n-2];
        int x = nums[n-1];

        int y = nums[0];
        int z = nums[1];

        return ((w * x ) - (y * z));
    }
}