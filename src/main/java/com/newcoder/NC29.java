package com.newcoder;

public class NC29 {
    public static void main(String[] args) {
        int[][] arr= new int[10][5];

    }

    public static boolean searchMatrix (int[][] matrix, int target) {
        // write code here
        if(matrix[0][0]>target || matrix[matrix.length-1][matrix[0].length-1]<target){
            return false;
        }
        int line = 0;
        for (int i = 1; i < matrix.length; i++) {
            line=i-1;
            if(matrix[i][0]>target){
                break;
            }
        }
        for (int i = 0; i < matrix[line].length; i++) {
            if(matrix[line][i]==target){
                return true;
            }
        }
        return false;
    }
}


