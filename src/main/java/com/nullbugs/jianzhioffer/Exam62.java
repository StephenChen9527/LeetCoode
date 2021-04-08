package com.nullbugs.jianzhioffer;

import java.util.HashSet;
import java.util.Set;

public class Exam62 {


    public static void main(String[] args) {

    }

    public int lastRemaining(int n, int m) {
        Set<Integer> set = new HashSet<>();

        int step = 1;
        int num = 0;
        while (true){
            if(step==m){
                if(!set.add(num)){
                    step -- ;
                }else {
                    step = 0;
                }
            }
            if(num==(n-1)){
                num = 0;
            }
            num++;



        }




    }
}
