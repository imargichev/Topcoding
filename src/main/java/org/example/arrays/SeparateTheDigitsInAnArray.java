package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {
        int[] arr = {13, 25, 83, 77};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> separateNumbers = new ArrayList<>();

        for (int num : nums) {
            List<Integer> digits = new ArrayList<>();
            while (num > 0) {
                digits.add(num % 10);
                num /= 10;
            }
            if (digits.size() > 1) {
                int temp = digits.getFirst();
                digits.set(0, digits.getLast());
                digits.set(digits.size() - 1, temp);
            }
            separateNumbers.addAll(digits);
        }

        return separateNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}