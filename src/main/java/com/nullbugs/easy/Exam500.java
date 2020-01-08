package com.nullbugs.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam500 {

    public static void main(String[] args) {
        String[] arr=new String[]{"asdfghjklASDFGHJKLasdfghjklASDFGHJKLzxcvbnmZXCVBNMaew","asdfghjklASDFGHJKLqwertyuiopQWERTYUIOP","zxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaew"};
        findWords(arr);
    }

    public static String[] findWords(String[] words) {
        if(words == null || words.length==0){
            return new String[0];
        }
        String line1Regex="[^QWERTYUIOPqwertyuiop]";
        String line2Regex="[^ASDFGHJKLasdfghjkl]";
        String line3Regex="[^ZXCVBNMzxcvbnm]";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            Matcher m1 = Pattern.compile(line1Regex).matcher(words[i]);
            Matcher m2 = Pattern.compile(line2Regex).matcher(words[i]);
            Matcher m3 = Pattern.compile(line3Regex).matcher(words[i]);
            if(!m1.find() || !m2.find() || !m3.find()){
                sb.append(words[i]).append(" ");
            }
        }
        if(sb.toString().trim().length()==0){
            return new String[0];
        }
        return sb.toString().trim().split(" ");
    }


}
