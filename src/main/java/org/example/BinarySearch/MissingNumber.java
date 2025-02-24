package org.example.BinarySearch;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        //сортираме масива
        Arrays.sort(nums);
        //инициализираме лявата и дясната граница
        int left = 0;
        int right = nums.length - 1;

        //докато лявата граница е по-малка или равна на дясната граница
        while (left <= right) {
            //намираме средния елемент
            int mid = left + (right - left) / 2;
            //ако средния елемент е равен на индекса на средния елемент
            if (nums[mid] == mid) {
                //преместваме лявата граница с едно на дясно
                left = mid + 1;
            } else {
                //ако не е равен, преместваме дясната граница с едно на ляво
                right = mid - 1;
            }
        }
        //връщаме лявата граница
        return left;
    }
}
