package org.example.arrays;

/**
 * This class contains a method to calculate the sum of the squares of special elements in an array.
 * An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.
 */
public class SumOfSquaresOfSpecialElements {

    /**
     * The main method to execute the program.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int[] input  = {1,2,3,4};

        System.out.println(sumOfSquares(input));
        // Example usage of the method can be added here
    }

    /**
     * Calculates the sum of the squares of all special elements in the given array.
     *
     * @param nums The input array of integers
     * @return The sum of the squares of all special elements
     */
    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (nums[i] % i == 0){
                sum += Math.sqrt(nums[i-1]);
            }
        }

        return sum;
    }
}