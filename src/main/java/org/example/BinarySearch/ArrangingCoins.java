package org.example.BinarySearch;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        //инициализираме лявата и дясната граница
        long left = 0;
        long right = n;

        //докато лявата граница е по-малка или равна на дясната граница
        while (left <= right) {
            //намираме средния елемент
            long mid = left + (right - left) / 2;
            //намираме сумата на първите mid естествени числа
            long sum = mid * (mid + 1) / 2;
            //ако сумата е равна на n
            if (sum == n) {
                //връщаме mid
                return (int) mid;
                //ако сумата е по-голяма от n
            } else if (sum > n) {
                //преместваме дясната граница с едно на ляво
                right = mid - 1;
            } else {
                //ако сумата е по-малка от n
                //преместваме лявата граница с едно на дясно
                left = mid + 1;
            }
        }
        //връщаме дясната граница
        return (int) right;
    }
}
