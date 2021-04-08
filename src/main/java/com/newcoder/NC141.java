package com.newcoder;

public class NC141 {

    public static void main(String[] args) {

    }

    public static boolean judge (String str) {
        // write code here
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;

    }


}
