package com.nullbugs.easy;

import java.util.*;

/**
 * 感觉这种无脑循环的是真的是垃圾
 *
 */
public class Exam1160 {
    public static void main(String[] args) {
        countCharacters(new String[]{"cat","bc","hat","tree"},"atach");
    }
    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i),map.get(chars.charAt(i))==null?1:(map.get(chars.charAt(i))+1));
        }

        for (String word : words) {
            if(word.length()>chars.length()){
                continue;
            }
            boolean can=true;
            HashMap<Character,Integer> temp= (HashMap<Character, Integer>) map.clone();
            for (int i = 0; i < word.length(); i++) {
                if(temp.get(word.charAt(i))==null || temp.get(word.charAt(i))<=0){
                    can=false;
                    break;
                }
                temp.put(word.charAt(i),temp.get(word.charAt(i))-1);
            }
            if(can){
                count+=word.length();
            }

        }



        return count;
    }
}
