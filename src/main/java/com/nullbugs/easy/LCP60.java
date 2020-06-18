package com.nullbugs.easy;

public class LCP60 {


    public static void main(String[] args) {
        //System.out.println(minCount(new int[]{4,2,1}));

        System.out.println(101>>2);
    }
    public static int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            count+=coins[i]/2;
            if(coins[i]%2!=0){
                count++;
            }
        }
        return count;
    }
}
