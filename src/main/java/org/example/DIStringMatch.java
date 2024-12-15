package org.example;

public class DIStringMatch {
    public static void main(String[] args) {

    }
    static public int[] diStringMatch(String s) {
        int size = s.length();

        int low = 0;
        int high = size;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'I'){
                array[i] = low;
                low++;
            }else {
                array[i] = high;
                high--;
            }
        }
        array[size] = low;
        return array;
    }
}
