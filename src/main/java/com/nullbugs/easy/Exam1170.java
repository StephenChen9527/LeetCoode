package com.nullbugs.easy;

import java.util.Arrays;

public class Exam1170 {

    public static void main(String[] args) {
        int[] ints = numSmallerByFrequency(new String[]{"bbb","cc"}, new String[]{"a","aa","aaa","aaaa"});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] qa=new int[queries.length];
        int[] wa=new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wa[i]=count(words[i]);
        }
        Arrays.sort(wa);
        for (int i = 0; i < queries.length; i++) {
            qa[i]=count(queries[i]);
        }

        for (int i = 0; i < qa.length; i++) {
            int j = 0;
            for (; j < wa.length; j++) {
                if(qa[i]<wa[j]){
                    break;
                }
            }
            qa[i]=wa.length-j;

        }

        return qa;
    }

    public static int count(String str){
        if(str==null || str.length()==0 ){
            return 0;
        }
        if(str.length()==1){
            return 1;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count=chars[0]==chars[chars.length-1]?1:0;
        for (int i = 0; i < chars.length-1; i++) {
            count++;
            if(chars[i]!=chars[i+1]){
                break;
            }
        }
        return count;

    }
}
