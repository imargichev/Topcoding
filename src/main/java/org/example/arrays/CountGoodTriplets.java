package org.example.arrays;

/**
 * This class contains a method to count the number of good triplets in an array.
 * A triplet (arr[i], arr[j], arr[k]) is considered good if the following conditions are met:
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * Where |x| denotes the absolute value of x.
 */
public class CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7;
        int b = 2;
        int c = 3;

        int result = countGoodTriplets(arr, a, b, c);
        System.out.println(result);
    }

    /**
     * Counts the number of good triplets in the given array.
     *
     * @param arr the array of integers
     * @param a the maximum allowed difference between arr[i] and arr[j]
     * @param b the maximum allowed difference between arr[j] and arr[k]
     * @param c the maximum allowed difference between arr[i] and arr[k]
     * @return the number of good triplets
     */
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int counter = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a) {
                        if (Math.abs(arr[j] - arr[k]) <= b) {
                            if (Math.abs(arr[i] - arr[k]) <= c) {
                                System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }
}