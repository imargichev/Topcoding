package org.example.Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public static void main(String[] args) {

    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {


        for (int i = 0; i < k; i++) {
            int indx = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[indx]){
                    indx = j;
                }
            }
            nums[indx] *= multiplier;
        }

        return nums;
    }
}
