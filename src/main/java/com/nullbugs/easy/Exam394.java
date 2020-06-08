package com.nullbugs.easy;

public class Exam394 {

    public static void main(String[] args) {

    }

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c<=9 && 0<=c){
                Integer.valueOf(String.valueOf(c));
            }

        }
        return sb.toString();
    }

    public String loop(String s,int loop){
        return null;
    }
}
