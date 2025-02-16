package org.example.BinarySearch;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
       int[] arr1 = {4,5,8};
       int[]arr2 = {10,9,1,8};
       int d = 2;
         System.out.println(findTheDistanceValue(arr1, arr2, d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Initialize the count of elements that satisfy the condition
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            // Perform binary search to find the closest element in arr2
            // лявата граница е 0
            int left = 0;
            // дясната граница е дължината на втория масив - 1
            int right = arr2.length - 1;
            // флаг, който показва дали сме намерили елемент, който удовлетворява условието
            boolean found = false;
            // докато лявата граница е по-малка или равна на дясната
            while (left <= right) {
                // намираме средния елемент
                int mid = left + (right - left) / 2;
                // ако разликата между елементите на първия масив и втория масив на позиция mid е по-малка или равна на d
                if (Math.abs(arr1[i] - arr2[mid]) <= d) {
                    // флагът става true
                    found = true;
                    // излизаме от цикъла
                    break;
                // ако елемента на позиция mid от втория масив е по-голям от елемента на позиция i от първия масив
                } else if (arr1[i] < arr2[mid]) {
                    // дясната граница става mid - 1
                    right = mid - 1;
                } else {
                    // в противен случай лявата граница става mid + 1
                    left = mid + 1;
                }
            }
            // ако не сме намерили елемент, който удовлетворява условието
            if (!found) {
                // увеличаваме брояча с 1
                count++;
            }
        }
        // връщаме брояча
        return count;
    }
}
