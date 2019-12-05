package com.nullbugs.easy;

public class Exam9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=Integer.valueOf(x).toString();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf(-11).toString());
    }
}
