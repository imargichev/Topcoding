package org.example.arrays;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,5,5,4};
       ;
        System.out.println(sumOfUnique(array));
    }
    public static int sumOfUnique(int[] nums) {

        int[] count = new int[nums.length];

        for (int num : nums) {
            count[num]++;
        }

        int sum = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}
