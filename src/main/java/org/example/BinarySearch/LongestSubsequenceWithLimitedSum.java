package org.example.BinarySearch;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 1};
        int[] queries = {3, 10, 21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] prefixSums = new int[nums.length];
        prefixSums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i];
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = findMaxSubsequenceLength(prefixSums, queries[i]);
        }

        return result;
    }

    private static int findMaxSubsequenceLength(int[] prefixSums, int query) {
        int left = 0, right = prefixSums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (prefixSums[mid] <= query) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}