package com.nullbugs.easy;

import java.util.*;
import java.util.stream.Collectors;

public class Exam1002 {

    public static void main(String[] args) {
        commonChars(new String[]{"cool","lock","cook"});
    }

    public static List<String> commonChars(String[] A) {
        Map<String,Integer> map = null;
        for (int i = 0; i < A.length; i++) {
            Map<String,Integer> temp = new HashMap<>();
            String[] ss = A[i].split("");
            for (int j = 0; j < ss.length; j++) {
                if(map == null){
                    temp.put(ss[j],temp.getOrDefault(ss[j],0)+1);
                }else if(map.getOrDefault(ss[j],0)>0){
                    map.put(ss[j],map.get(ss[j])-1);
                    temp.put(ss[j],temp.getOrDefault(ss[j],0)+1);
                }
            }
            map = temp;

        }
        List<String> strs = new LinkedList<>();
        for (String s : map.keySet()) {
            Integer x = map.get(s);
            for (Integer i = 0; i < x; i++) {
                strs.add(s);
            }
        }

        return strs;
    }

}
