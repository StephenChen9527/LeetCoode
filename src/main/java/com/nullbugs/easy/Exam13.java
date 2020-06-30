package com.nullbugs.easy;

public class Exam13 {

    public int romanToInt(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='M'){
                count +=1000;
            }
            if(i>1){

            }
        }
        return count;
    }
}
