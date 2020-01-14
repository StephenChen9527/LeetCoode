package com.nullbugs.easy;

import java.util.HashMap;
import java.util.Map;

public class Exam953 {


    public boolean isAlienSorted(String[] words, String order) {
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(String.valueOf(order.charAt(i)),i);
        }
        for (int i = 0; i < words.length; i++) {
            if(min(words[i],words[i+1])){
                return false;
            }
        }
        return false;
    }
    public boolean min(String a,String b){

        return false;
    }
}
