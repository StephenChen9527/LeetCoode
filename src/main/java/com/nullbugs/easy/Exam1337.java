package com.nullbugs.easy;

import java.util.*;

public class Exam1337 {

    public static void main(String[] args) {
        kWeakestRows(new int[][]{
                {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
                {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}},
        1);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        /*Map<Integer,String> map = new TreeMap<>();
        for (int i = 0; i < mat.length; i++) {
            int fight = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]==0){
                    break;
                }
                fight++;
            }
            //set.add(fight+"_"+i);
        }
        int[] res= new int[k];
        String[] strings = set.toArray(new String[0]);
        for (int i = 0; i < res.length; i++) {
            res[i]=Integer.valueOf(strings[i].split("_")[1]);
        }
        return res;*/
        return null;
    }

}
