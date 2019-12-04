package com.nullbugs.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(min>arr[i+1]-arr[i]){
                min=arr[i+1]-arr[i];
            }
        }
        //找出min最小
        for (int i = 0; i < arr.length-1; i++) {
            if(min==arr[i+1]-arr[i]){
                List<Integer> temp=new ArrayList();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
