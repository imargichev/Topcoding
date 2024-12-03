package org.example;

import java.util.Arrays;

/**
 * This class contains a method to find the integer added to each element of one array to make it equal to another array.
 */
public class FindTheIntegerAddedToArrayI {
    public static void main(String[] args) {
        // Example usage of the findAddedInteger method
        int[] nums1 = {2,6,4};

        int[] nums2 = {9,7,5};
    }

    /**
     * Finds the integer added to each element of nums1 to make it equal to nums2.
     *
     * @param nums1 the first array of integers
     * @param nums2 the second array of integers, which is nums1 with an integer added to each element
     * @return the integer added to each element of nums1 to make it equal to nums2
     */
    public static int findAddedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int x = nums2[0] - nums1[0];

        return x; // Placeholder return value
    }
}