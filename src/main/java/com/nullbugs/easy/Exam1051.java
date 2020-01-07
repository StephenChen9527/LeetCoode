package com.nullbugs.easy;

import java.util.Arrays;

public class Exam1051 {

    public static void main(String[] args) {


    }
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] temp = heights.clone();
        Arrays.sort(temp);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=temp[i])
                count++;
        }
        return count;
    }
}
