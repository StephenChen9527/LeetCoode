package com.nullbugs.easy;

public class Exam1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            int count = 0 ;
            for (int i = 0; i < startTime.length; i++) {
                if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                    count++;
                }
            }
            return count;
    }

}
