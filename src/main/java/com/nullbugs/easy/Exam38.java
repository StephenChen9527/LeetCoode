package com.nullbugs.easy;

public class Exam38 {

    public static void main(String[] args) {
        countAndSay(5);
    }
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s = countAndSay(n-1);
        char[] chars = s.toCharArray();
        int count = 0;
        char c = 'a';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]!=c){
                if(count!=0){
                    sb.append(count).append(c);
                }
                c=chars[i];
                count=1;
            }else {
                count++;
            }
        }
        if(count!=0){
            sb.append(count).append(c);
        }
        return sb.toString();
    }
}
