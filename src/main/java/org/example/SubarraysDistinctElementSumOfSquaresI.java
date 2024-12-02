package org.example;

import java.util.HashSet;
import java.util.List;

public class SubarraysDistinctElementSumOfSquaresI {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3);
        System.out.println(sumCounts(nums));
    }
    public static int sumCounts(List<Integer> nums) {
        int n = nums.size();

        HashSet<Integer> storedNumbers = new HashSet<>(nums);

        int sum = 0;

        for (Integer number : storedNumbers){
            sum += (int) Math.sqrt(number);
        }

        return sum;
    }
}
