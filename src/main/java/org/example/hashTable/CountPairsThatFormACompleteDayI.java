package org.example.hashTable;

public class CountPairsThatFormACompleteDayI {
    public static void main(String[] args) {
        int [] time = {72,48,24,3};
        System.out.println(countCompleteDayPairs(time));
    }
    public static int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    if (i < j){
                        count++;
                    }

                }
            }
        }
        return count;
    }
}
