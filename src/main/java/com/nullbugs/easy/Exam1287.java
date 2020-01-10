package com.nullbugs.easy;

public class Exam1287 {

    public static int findSpecialInteger(int[] arr) {
        int result=0;
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==result){
                count++;
                if(count*4>arr.length){
                    return arr[i];
                }
            }else{
                result=arr[i];
                count=1;
            }
        }

        return result;
    }

}
