package com.nullbugs.easy;

import java.util.Arrays;

public class Exam1370 {

    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        char[] result = new char[chars.length];
        result[0]=chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]>chars[i-1]){
                result[i]=chars[i];
            }
        }
        return new String(result);

    }
}
