package com.nullbugs.easy;

public class Exam258 {


    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {

        //return (num - 1) % 9 + 1;

        int count=0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            count=(Integer.valueOf(String.valueOf(s.charAt(i)))+count);
            if(count>10){
                count=count%10+1;
            }
        }
        return count;

    }
}
