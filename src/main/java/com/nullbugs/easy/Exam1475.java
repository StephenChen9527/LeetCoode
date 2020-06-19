package com.nullbugs.easy;

public class Exam1475 {

    public static void main(String[] args) {
        finalPrices(new int[]{8,7,4,2,8,1,7,7,10,1});
    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[i]>=prices[j]){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
