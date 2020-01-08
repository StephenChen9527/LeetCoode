package com.nullbugs.easy;

public class Exam476 {

    public static void main(String[] args) {
        findComplement(6);
    }
    public static int findComplement(int num) {
        String str = Integer.toBinaryString(~num).substring(32 - Integer.toBinaryString(num).length(), 32);
        System.out.println(Integer.parseInt(str,2));

        return Integer.parseInt(str,2);

    }
}
