package org.example.BinarySearch;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println(maximumCount(nums));
    }

    public static int maximumCount(int[] nums) {
        int minCount = 0;
        int maxCount = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] < 0) {
                minCount++;
                left++;
            } else if (nums[right] > 0) {
                maxCount++;
                right--;
            } else {
                if (nums[left] == 0) left++;
                if (nums[right] == 0) right--;
            }
        }
        return Math.max(minCount, maxCount);
    }
}