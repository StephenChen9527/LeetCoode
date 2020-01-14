package com.nullbugs.easy;

public class Exam1009 {
    public static void main(String[] args) {
        int x=10;
        //System.out.println(Integer.toBinaryString(~x));
        System.out.println(bitwiseComplement(x));
    }
    public static int bitwiseComplement(int N) {
        String s = Integer.toBinaryString(~N);
        String t = Integer.toBinaryString(N);
        return Integer.valueOf(s.substring(s.length()-t.length()), 2);

    }
}
