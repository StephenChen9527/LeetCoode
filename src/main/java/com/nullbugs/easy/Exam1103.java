package com.nullbugs.easy;

public class Exam1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        // n 轮
        int n=candies/num_people;
        for (int i = 0; i < arr.length; i++) {
            int c = (n-1) * num_people ;
            arr[i] = c ;
        }
        return arr;
    }
}
