package com.nullbugs.easy;

import java.util.Stack;

public class Exam682 {

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }

    /**
     * + 前两轮总和
     * D 前一轮有效得分 2倍
     * C 上一个得分无效
     * @param ops
     * @return
     */

    public static int calPoints(String[] ops) {
        Stack<Integer> s=new Stack<>();
        int count=0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]){
                case "+":
                    int t=s.pop();
                    int sum=t+s.peek();
                    s.push(t);
                    count+=sum;
                    s.push(sum);
                    break;
                case "D":
                    count+=s.peek()*2;
                    s.push(s.peek()*2);
                    break;
                case "C":
                    count-=s.pop();
                    break;
                default:
                    count+=Integer.valueOf(ops[i]);
                    s.push(Integer.valueOf(ops[i]));
                    break;
            }
        }

        return count;
    }
}
