package com.nullbugs.easy;

import java.util.Stack;

public class Exam1047 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates2("abbacaccbba"));
    }
    public static String removeDuplicates(String S) {
        for (int i = 0; i < S.length()-1; ) {
            if(S.charAt(i)==S.charAt(i+1)){
                S= S.substring(0,i)+S.substring(i+2, S.length());
                i=i-1>0?i-1:0;
            }else{
                i++;
            }
        }

        return S;
    }

    public static String removeDuplicates2(String S) {
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if(s.size()>0 && S.charAt(i)==s.peek()){
                s.pop();
            }else{
                s.push(S.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!s.empty()){
            sb.append(s.pop());
        }

        return sb.reverse().toString();
    }
}
