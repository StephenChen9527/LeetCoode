package com.nullbugs.easy;

public class Exam1309 {

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                String t=String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
                sb.append((char)(Integer.valueOf(t)+96));
                i+=3;
            }else{
                sb.append((char)(Integer.valueOf(String.valueOf(s.charAt(i)))+96));
                i++;
            }
        }

        return sb.toString();
    }

}
