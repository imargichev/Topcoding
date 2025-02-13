package org.example.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;

        System.out.println(targetIndices(nums, target));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);

        // Initialize the result list
        List<Integer> result = new ArrayList<>();

        // Perform binary search to find the first occurrence of the target
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Collect all indices where the target is found
        while (left < nums.length && nums[left] == target) {
            result.add(left);
            left++;
        }

        // Return the result list
        return result;
    }
}
