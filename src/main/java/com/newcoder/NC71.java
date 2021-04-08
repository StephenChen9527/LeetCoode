package com.newcoder;

public class NC71 {

    public int minNumberInRotateArray(int [] array) {
        if(array==null || array.length ==0){
            return 0;
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }

        return min;
    }
}
