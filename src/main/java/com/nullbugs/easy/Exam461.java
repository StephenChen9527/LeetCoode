package com.nullbugs.easy;

/**
 *
 *
 */
public class Exam461 {


    public static void main(String[] args) {
        hammingDistance(19,33);
    }


    static int hammingDistance(int x, int y) {
        int count =0;
        int t=x^y;
        while (t != 0) {
            count++;
            t = t & (t - 1);
        }
        return count;
    }



}
