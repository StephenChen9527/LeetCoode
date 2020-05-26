package com.nullbugs.me;

import java.util.HashMap;
import java.util.Map;

public class COUYINGBI {


    public static void main(String[] args) {

        int[] coins={1,2,5};
        int amount=13;
        int couYB = two(coins, amount);
        System.out.println(couYB);
    }

    public static int couYB(int[] coins,int amount){
        if(amount==0){
            return 0;
        }
        if(amount<coins[0]){
            return -1;
        }

        for (int i = coins.length-1; i >=0; i--) {
            if(amount<coins[i]){
                continue;
            }
            int need=couYB(coins,amount-coins[i]);
            return need==-1?-1:1+need;
        }
        return -1;
    }


    private static Map<Integer,Integer> dict=new HashMap<>();

    public static int two(int[] coins,int amount){
        if(amount<0){
            return -1;
        }
        if(amount==0){
            return 0;
        }
        if(dict.get(amount)!=null){
            return dict.get(amount);
        }
        int res=Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = two(coins, amount - coin);

            if(sub==-1) continue;
            res=Integer.min(1+sub,res);
        }
        if(dict.get(amount)==null){
            dict.put(amount,res==Integer.MAX_VALUE?-1:res);
        }
        return dict.get(amount);
    }
}
