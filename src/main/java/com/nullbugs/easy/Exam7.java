package com.nullbugs.easy;

public class Exam7 {
    public static void main(String[] args) {
        reverse(-100);
    }

    public static int reverse(int i){
        int tmp = i;
        if(i>0){
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            System.out.println(sb.reverse().toString());
        }

        return 0;
    }
}
