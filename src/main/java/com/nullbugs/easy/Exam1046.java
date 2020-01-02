package com.nullbugs.easy;

import java.util.Arrays;

public class Exam1046 {


    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }

        Arrays.sort(stones);
        if(stones[stones.length]!=stones[stones.length-1]){
            stones[stones.length-1]=Math.abs(stones[stones.length]-stones[stones.length-1]);
            return lastStoneWeight(Arrays.copyOfRange(stones,0,stones.length-1));
        }else{
            return lastStoneWeight(Arrays.copyOfRange(stones,0,stones.length-2));
        }

        /*for (int i = 0; i < stones.length-1; i++) {
            stones[i+1]=Math.abs(stones[i]-stones[i+1]);
        }
        return stones[stones.length-1];*/


    }

}
