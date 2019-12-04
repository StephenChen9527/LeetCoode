package com.nullbugs.easy;

import java.util.Arrays;

public class Exam389 {

    public static char findTheDifference(String s, String t) {
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            c+=t.charAt(i);
            c-=s.charAt(i);
        }
        c+=t.charAt(t.length()-1);
        return (char) c;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }
}
