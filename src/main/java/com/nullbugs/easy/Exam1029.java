package com.nullbugs.easy;

public class Exam1029 {

    public int twoCitySchedCost(int[][] costs) {
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            count += Math.min(costs[i][0],costs[i][1]);
        }
        return count;
    }


}
