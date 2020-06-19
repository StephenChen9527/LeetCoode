package com.nullbugs.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exam1252 {

    //0 0 0
    //0 0 0

    //0 1
    //1 1

    public int oddCells(int n, int m, int[][] indices) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < indices.length; i++) {
            int x = indices[i][0];
            int y = indices[i][1];
            for (int j = 0; j < m; j++) {
                String xy=x+"_"+j;
                if(set.contains(xy)){
                    set.remove(xy);
                }else {
                    set.add(xy);
                }
            }
            for (int j = 0; j < n; j++) {
                String xy=j+"_"+y;
                if(set.contains(xy)){
                    set.remove(xy);
                }else {
                    set.add(xy);
                }
            }
        }


        return set.size();
    }
}
