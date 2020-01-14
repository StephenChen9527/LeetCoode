package com.nullbugs.easy;

import java.util.Arrays;

public class Exam1046 {

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{5,5}));
    }

    public static int lastStoneWeight(int[] stones) {
        if(stones ==null || stones.length==0){
            return 0;
        }
        if(stones.length==1){
            return stones[0];
        }

        Arrays.sort(stones);
        if(stones[stones.length-1]!=stones[stones.length-2]){
            stones[stones.length-2]=Math.abs(stones[stones.length-1]-stones[stones.length-2]);
            return lastStoneWeight(Arrays.copyOfRange(stones,0,stones.length-1));
        }else{
            return lastStoneWeight(Arrays.copyOfRange(stones,0,stones.length-2));
        }



    }




}
