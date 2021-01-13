package com.nullbugs.jianzhioffer;

public class Exam58_II {

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
    }


    public static String reverseLeftWords(String s, int n) {
        if(n<0 || s==null || n>s.length()){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
