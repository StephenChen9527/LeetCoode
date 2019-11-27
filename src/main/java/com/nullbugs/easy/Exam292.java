package com.nullbugs.easy;

public class Exam292 {

    public static void main(String[] args) {
        System.out.println(canWinNim(10));

    }

    /**
     * 题目是 你先手  如何赢
     *
     * 可以考虑 我后手  如何赢
     *
     * @param n
     * @return
     */
    public static boolean canWinNim(int n) {
        return n%4==0;
    }
}
