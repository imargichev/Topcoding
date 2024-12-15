package org.example;

public class FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {
        int[] inputs = {8,4,6,2,3};
        int [] result = finalPrices(inputs);
        for (int i : result){
            System.out.println(i);
        }
    }
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j <prices.length; j++) {
                if(prices[j] <= prices[i]){
a
                }
            }
        }
    }
}
