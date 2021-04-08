package com.nullbugs.jianzhioffer;

public class Exam15 {

    public static void main(String[] args) {

        int n = -1 ;
        System.out.println(Integer.bitCount(n));
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int res = 0 ;
        while (n!=0){
            if((n&1 )== 1){
                res ++ ;
            }
            n = n>>>1;
        }
        return res;
    }
}
