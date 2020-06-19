package com.nullbugs.easy;

import java.util.LinkedList;
import java.util.List;

public class Exam728 {
    public static void main(String[] args) {
        selfDividingNumbers(1,22);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            String s = String.valueOf(i);
            if(s.contains("0")){
                continue;
            }
            char[] chars = s.toCharArray();
            boolean b =true;
            for (int j = 0; j < chars.length; j++) {
                int x = Integer.valueOf(chars[j]);
                if(i%x!=0){
                    b = false;
                    break;
                }
            }
            if(b){
                list.add(i);
            }
        }
        return list;
    }


}
