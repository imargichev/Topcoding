package org.example.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
       int[] nums2 = {2,2};
       intersection(nums1, nums2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        ArrayList<Integer> prepResult = new ArrayList<>();


        for (Integer number : set1){
            if (set2.contains(number)){
                prepResult.add(number);
            }
        }
        return prepResult.stream().mapToInt(i -> i).toArray();
    }
}
