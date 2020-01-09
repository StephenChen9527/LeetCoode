package com.nullbugs.easy;

public class Exam171 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    /**
     *  26 进制
     * @param s
     * @return
     */
    public static int titleToNumber(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            count+=(s.charAt(i)-64)*Math.pow(26,s.length()-1-i);
        }
        return count;
    }
}
