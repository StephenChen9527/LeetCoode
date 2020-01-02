package com.nullbugs.easy;

public class Exam1281 {

    public static void main(String[] args) {

    }

    public int subtractProductAndSum(int n) {
        int count = 0;
        int product = 1;
        String[] split = String.valueOf(n).split("");
        for (int i = 0; i < split.length; i++) {
            count+=Integer.valueOf(split[i]);
            product*=Integer.valueOf(split[i]);
        }
        return product-count;
    }
}
