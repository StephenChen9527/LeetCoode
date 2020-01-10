package com.nullbugs.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exam1078 {

    public static void main(String[] args) {
        String[] strings = findOcurrences("alice is a good girl she is a good student", "a", "good");
        System.out.println(Arrays.toString(strings));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list=new LinkedList<>();
        String[] strs = text.split(" ");
        for (int i = 0; i < strs.length-2; i++) {
            if(first.equals(strs[i]) && second.equals(strs[i+1])){
                list.add(strs[i+2]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
