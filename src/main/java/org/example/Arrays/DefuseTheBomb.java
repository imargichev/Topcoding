package org.example.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int [] input = {5,7,1,4};
        int[] newArray = decrypt(input, 3);
    }
    public static int[] decrypt(int[] code, int k) {
        int length = code.length;
        int [] result = new int[length];


        if (k == 0) {
            return result;
        }


        for (int i = 0; i < length; i++) {
            int sum = 0;
            if(k > 0){
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % length];
                }
            }else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + length) % length];
                }
            }
            result[i] = sum;
        }
return result;




    }
}
