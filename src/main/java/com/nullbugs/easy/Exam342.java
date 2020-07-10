package com.nullbugs.easy;

public class Exam342 {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(16*4));
        /*for (int i =1 ; i<1000;i++ ){
            if(isPowerOfFour(i)){
                System.out.println("i="+i+"是");
            }
        }*/
    }
    public static boolean isPowerOfFour(int num) {
        //int x = 0b;
        if(num<1){
            return false;
        }
        if(num==1){
            return true;
        }

        while (num>1){
            if((num&3)!=0){
                return false;
            }
            num = num>>2;
        }
        return true;

    }
}
