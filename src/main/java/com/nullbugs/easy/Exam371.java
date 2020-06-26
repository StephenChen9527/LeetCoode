package com.nullbugs.easy;

public class Exam371 {
    public static void main(String[] args) {
        System.out.println(getSum(1,1));
    }
    public static int getSum(int a, int b) {
        return a|b;
    }
}
