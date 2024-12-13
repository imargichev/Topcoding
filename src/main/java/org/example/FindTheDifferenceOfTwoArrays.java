package org.example;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        findDifference(nums1,nums2);
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);

        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);

        return Arrays.asList(diff1, diff2);

    }
}
