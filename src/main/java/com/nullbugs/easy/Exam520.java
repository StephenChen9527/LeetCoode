package com.nullbugs.easy;

public class Exam520 {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));
    }
    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if(chars.length<1){
            return true;
        }

        for (int i = 0  ; i < chars.length-1; i++) {
            char cur = chars[i];
            char next = chars[i+1];
            //cur 大写， 下一个小写
            if(cur<=90 && next >=97 && i!=1){
                return false;
            }
            if(cur>=97 && next<=90){
                return false;
            }
        }
        return true;
    }
}
