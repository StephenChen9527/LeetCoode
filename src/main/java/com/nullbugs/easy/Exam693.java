package com.nullbugs.easy;

public class Exam693 {

    public static void main(String[] args) {
        hasAlternatingBits(7);
    }

    public static boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }

        return true;
    }
}
