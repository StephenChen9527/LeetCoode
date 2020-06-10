package com.nullbugs.easy;

public class Exam1323 {

    public int maximum69Number (int num) {
        String str = String.valueOf(num);

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='6'){
                chars[i]='9';
                break;
            }
        }
        return Integer.valueOf(new String(chars));
    }
}
