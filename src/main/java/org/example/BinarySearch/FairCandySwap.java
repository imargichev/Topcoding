package org.example.BinarySearch;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int sumA = 0;
        for (int size : aliceSizes) {
            sumA += size;
        }

        int sumB = 0;
        for (int size : bobSizes) {
            sumB += size;
        }

        int delta = (sumA - sumB) / 2;

        int i = 0;
        int j = 0;

        while (i < aliceSizes.length && j < bobSizes.length) {

            int diff = aliceSizes[i] - bobSizes[j];

            if (diff == delta) {
                return new int[]{aliceSizes[i], bobSizes[j]};
            } else if (diff < delta) {
                i++;
            } else {
                j++;
            }
        }

        return new int[0];


    }
}
