package org.example.BinarySearch;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
       int n = 10;
       int pick = 6;
        System.out.println(guessNumber(n));

    }
    public static int guessNumber(int n) {
        int left = 1;
        int right = n;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0){
                return mid;
            } else if (guess(mid) == 1){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
   public static int guess(int num){
        int pick = 6;
        if (num == pick){
            return 0;
        } else if (num < pick){
            return 1;
        } else {
            return -1;
        }
   }
}
