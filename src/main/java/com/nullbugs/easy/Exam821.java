package com.nullbugs.easy;

import java.util.Arrays;

public class Exam821 {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(shortestToChar("loveleetcode",'e')));
        //System.out.println("loveleetcode".indexOf('e',3));
    }
    public static int[] shortestToChar(String S, char C) {
        int[] arr=new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            //int index=S.indexOf(C);
            if(S.charAt(i)==C){
                arr[i]=0;
                index=i;
            }else{
                arr[i]=(i-index)<(S.indexOf(C,i+1)-i)?(i-index):(S.indexOf(C,i+1)-i);
            }

        }
        return arr;
    }
}
