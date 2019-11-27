package com.nullbugs.easy;

public class Exam709 {
    public static void main(String[] args) {

    }
    public String toLowerCase(String str) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(65<=str.charAt(i) && str.charAt(i)<=106){
                sb.append((char)(str.charAt(i)+32));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

        //return str.toLowerCase();
    }
}
