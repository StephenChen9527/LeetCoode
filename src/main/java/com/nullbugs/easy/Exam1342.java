package com.nullbugs.easy;

public class Exam1342 {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps (int num) {
        int count = 0;
        while (num!=0){
            if((num&1)==1){
                num--;
            }else{
                num>>=1;
            }
            count++;
        }
        return count;
    }
}
