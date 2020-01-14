package com.nullbugs.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exam119 {

    public static void main(String[] args) {
        List<Integer> row = getRow(4);
        System.out.println(row);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex-i)/(i+1);
        }
        return res;
        /*if(rowIndex==0){
            List<Integer> list=new LinkedList<>();
            list.add(1);
            return list;
        }
        List<Integer> row = getRow(rowIndex - 1);
        for (int i = row.size()-1; i >0 ; i--) {
            row.set(i,row.get(i-1)+row.get(i));
        }
        row.add(1);
        return row;*/
    }
}
