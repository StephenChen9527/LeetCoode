package com.newcoder;

public class NC41 {

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(maxLength(arr));
    }
    public static int maxLength (int[] arr) {
        int max = 0;
        int len = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                len++;
            }else{
                max= Integer.max(max,len);
                len = 0;
            }
        }
        return Integer.max(max,len);
    }

}
