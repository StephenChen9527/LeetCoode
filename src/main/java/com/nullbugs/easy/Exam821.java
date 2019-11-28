package com.nullbugs.easy;

import java.util.Arrays;

/**
 * 官方推荐解法，是从左往右遍历， 找右边的最近的，复制ARR
 *  然后再从右往左遍历，找该位置，离左边，然后比较arr对应位置，赋值。
 *  这样就比较了 离左边，离右边更近的是哪个了。
 */
public class Exam821 {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(shortestToChar("aaba",'b')));
        //System.out.println("loveleetcode".indexOf('e',3));
    }
    public static int[] shortestToChar(String S, char C) {
        int[] arr=new int[S.length()];
        int index=-S.length();
        for (int i = 0; i < S.length(); i++) {
            //int index=S.indexOf(C);
            if(S.charAt(i)==C){
                arr[i]=0;
                index=i;
            }else{
                if((S.indexOf(C,i+1)-i)>0){
                    arr[i]=(i-index)<(S.indexOf(C,i+1)-i)?(i-index):(S.indexOf(C,i+1)-i);
                }else{
                    arr[i]=(i-index);
                }

            }

        }
        return arr;
    }
}
