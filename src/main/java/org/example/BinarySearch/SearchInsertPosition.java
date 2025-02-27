package org.example.BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        //инициализираме лявата и дясната граница
        int left = 0;
        int right = nums.length - 1;

        //докато лявата граница е по-малка или равна на дясната граница
        while (left <= right) {
            //намиране на средният елемент
            int mid = left + (right - left) / 2;
            //ако средният елемент е равен на търсения елемент
            if (nums[mid] == target) {
                return mid;
            }
            //ако средният елемент е по-малък от търсения елемент
            if (nums[mid] < target) {
                //премествме лявата граница с едно на дясно от средния елемент
                left = mid + 1;
            } else {
                //ако средният елемент е по-голям от търсения елемент
                //преместваме дясната граница с едно на ляво от средния елемент
                right = mid - 1;
            }


        }
        //връщаме лявата граница
        return left;
    }
}