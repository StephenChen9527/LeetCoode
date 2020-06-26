package com.nullbugs.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exam1446 {

    public int maxPower(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int t = 1;
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i] == chars[i+1]){
                t++;
            }else {
                l = Math.max(l,t);
                t=1;
            }
        }
        return Math.max(l,t);
    }

}
