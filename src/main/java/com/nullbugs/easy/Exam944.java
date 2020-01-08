package com.nullbugs.easy;

public class Exam944 {

    public static void main(String[] args) {

    }

    public int minDeletionSize(String[] A) {
        int D=0;

        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j].charAt(i)>A[j+1].charAt(i)){
                    D++;
                    break;
                }
            }
        }





        return D;
    }
}
