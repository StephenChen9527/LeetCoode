package com.nullbugs.easy;

import java.util.LinkedList;
import java.util.List;

public class Exam784 {

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }

    public static List<String> letterCasePermutation(String S) {

        return letterCasePermutation(S,0);
    }

    public static List<String> letterCasePermutation(String S,int index) {
        List<String> linkedList=new LinkedList<>();
        linkedList.add(S);
        for (int i = index; i < S.length(); i++) {
            char c=S.charAt(i);
            if('A'<=c && 'Z'>=c){
                linkedList.addAll(letterCasePermutation(S.substring(0,i)+ Character.toString((char)(c+32)) +S.substring(i+1,S.length()),i+1));
            }else if('a'<=c && 'z'>=c){
                linkedList.addAll(letterCasePermutation(S.substring(0,i)+ Character.toString((char)(c-32)) +S.substring(i+1,S.length()),i+1));
            }
        }
        return linkedList;
    }
}
