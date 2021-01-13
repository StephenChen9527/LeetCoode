package com.nullbugs.easy;

public class Exam1672 {

    public int maximumWealth(int[][] accounts) {
        if(accounts == null ){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+= accounts[i][j];
            }
            max = Integer.max(max,sum);
        }
        return max;

    }
}
