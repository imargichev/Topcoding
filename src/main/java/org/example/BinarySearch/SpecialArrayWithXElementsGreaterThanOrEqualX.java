package org.example.BinarySearch;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        //сортираме масива
        Arrays.sort(nums);
        //взимаме дължината на масива
        int n = nums.length;

        //за всяко число от 0 до n
        for (int x = 0; x <= n; x++) {
            //инициализираме лявата и дясната граница
            int left = 0;
            int right = n - 1;

            //докато лявата граница е по-малка или равна на дясната граница
            while (left <= right) {
                //намираме средния елемент
                int mid = left + (right - left) / 2;
                //ако средния елемент е по-голям или равен на x
                if (nums[mid] >= x) {
                    //преместваме дясната граница с едно на ляво
                    right = mid - 1;
                    //ако не е по-голям или равен на x
                } else {
                    //преместваме лявата граница с едно на дясно
                    left = mid + 1;
                }
            }
            //ако n - left е равно на x
            if (n - left == x) {
                return x;
            }
        }
        //ако няма такова число, връщаме -1
        return -1;
    }
}
