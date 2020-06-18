package com.nullbugs.easy;

import java.util.LinkedList;
import java.util.List;

public class Exam1431 {

    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max=Integer.max(candies[i],max);
        }
        List<Boolean> b = new LinkedList<>();
        for (int i = 0; i < candies.length; i++) {
            b.add(candies[i]+extraCandies>=max);
        }
        return b;
    }
}
