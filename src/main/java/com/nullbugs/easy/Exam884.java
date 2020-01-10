package com.nullbugs.easy;

import java.util.*;

public class Exam884 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple","sour")));
    }

    public static String[] uncommonFromSentences(String A, String B) {
        String[] strs=(A+" "+B).split(" ");
        Set<String> str=new HashSet<>();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            if(str.contains(strs[i])){
                set.remove(strs[i]);
            }else{
                set.add(strs[i]);
            }
            str.add(strs[i]);
        }
        return set.toArray(new String[0]);
    }
}
