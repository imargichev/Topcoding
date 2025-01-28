package org.example.HashTable;

import java.util.*;
import java.util.stream.Collectors;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));

    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            Set<Integer> unique1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            Set<Integer> unique2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            Set<Integer> unique3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());

            Set<Integer> result = new HashSet<>(unique1);
            result.retainAll(unique2);
            result.addAll(unique1.stream().filter(unique3::contains).collect(Collectors.toSet()));
            result.addAll(unique2.stream().filter(unique3::contains).collect(Collectors.toSet()));

            return new ArrayList<>(result);
    }
}
