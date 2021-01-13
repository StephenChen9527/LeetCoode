package com.nullbugs.easy;

public class Exam121 {

    public static void main(String[] args) {

    }

    /**
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int n = prices[j]-prices[i];
                if(max<n){
                    max=n;
                }
            }
        }
        return max;
    }
}
