package com.nullbugs.easy;

import java.util.ArrayList;
import java.util.List;

public class Exam22 {
    public static void main(String[] args) {
        List<String> strings = generateParenthesis(3);
        System.out.println(strings);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        p("",n,n,list);
        return list;
    }
    public static void p(String str,int left,int right,List<String> list){
        if(left>right||left<0 || right<0){
            return;
        }

        if(left==0 && right==0){
            list.add(str);
            return;
        }
        p(str+"(",left-1,right,list);
        p(str+")",left,right-1,list);
    }

}
