package org.example.BinarySearch;

import java.util.Arrays;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        //сортираме масива
        Arrays.sort(letters);

        //инициализираме лявата и дясната граница
        int left = 0, right = letters.length - 1;
        //докато лявата граница е по-малка или равна на дясната граница
        while (left <= right) {
            //намираме средния елемент
            int mid = left + (right - left) / 2;
            //ако средния елемент е по-малък или равен на target
            if (letters[mid] <= target){
                //преместваме лявата граница с едно на дясно
                left = mid + 1;
            } else {
                //ако не е по-малък или равен на target, преместваме дясната граница с едно на ляво
                right = mid - 1;
            }
        }
        //връщаме буквата на индекс left, ако left е по-малко от дължината на масива, иначе връщаме първата буква
        return left < letters.length ? letters[left] : letters[0];

    }
}
