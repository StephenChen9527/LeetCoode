package com.nullbugs.easy;

public class Exam557 {

    public static void main(String[] args) {
        reverseWords("Let's take LeetCode contest");
    }

    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                str.append(sb.reverse().toString()).append(" ");
                sb=new StringBuilder();
            }else {
                sb.append(s.charAt(i));
            }

        }
        str.append(sb.toString());
        System.out.println(str.toString());
        return str.toString();
    }
}
