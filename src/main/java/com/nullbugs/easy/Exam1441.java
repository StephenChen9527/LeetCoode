package com.nullbugs.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam1441 {

    public static void main(String[] args) {
        buildArray(new int[]{1,2},4);
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new LinkedList<>();
        int index = 0;
        for (int i = 1; i <= n && index<target.length; i++) {
            list.add("Push");
            if(target[index] != i){
                list.add("Pop");
            }else{
                index++;
            }
        }

        return list;
    }
}
