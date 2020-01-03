package com.nullbugs.easy;

public class Exam832 {

    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] arr=new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                arr[i][j]=~(A[i][A[i].length-1-j]);
            }
        }

        return arr;
    }
}
