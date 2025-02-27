package org.example.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
    }
    public static int search(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
