package org.example.Arrays;

/**
 * This class provides a method to calculate the sum of all subset XOR totals for a given array.
 */
public class SumOfAllSubsetXORTotals {
    /**
     * Main method to test the subsetXORSum function.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(subsetXORSum(nums));
    }

    /**
     * Calculates the sum of all subset XOR totals for the given array.
     *
     * @param nums The integer array to calculate the subset XOR totals
     * @return The sum of all subset XOR totals
     */
    private static int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 0;

        // Iterate over all possible subsets
        for (int i = 0; i < (1 << n); i++) {
            int xor = 0;
            // Calculate the XOR for the current subset
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j];
                }
            }
            // Add the XOR of the current subset to the total
            total += xor;
        }
        return total;
    }
}