package org.example.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};

        ;
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i+=2) {
            result += Math.min(nums[i],nums[i+1]);
        }
        return result;
    }
}
