package com.nullbugs.easy;

import java.util.*;

public class Exam771 {

    public static void main(String[] args) {
        String J="Aa";
        String S="aAAAAbbBBb";
        numJewelsInStones(J,S);
    }

    public static int numJewelsInStones(String J, String S) {
        int count=0;
        for (int i = 0; i < S.length(); i++) {
            if(J.contains(String.valueOf(S.charAt(i)))){
                count++;
            }
        }
        return count;
    }
}
