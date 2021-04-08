package com.newcoder;

public class NC7 {



    /**
     *
     * @param prices int整型一维数组
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int max = 0 ;
        if(prices!=null && prices.length!=0){
            int min = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if(min<prices[i]){
                    max = max > (prices[i]-min) ? max : (prices[i]-min);
                }else{
                    min = prices[i];
                }
            }
        }
        return max;
    }
}
