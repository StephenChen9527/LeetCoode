package com.nullbugs.easy;

public class Exam868 {

    public static void main(String[] args) {
        System.out.println(binaryGap(6));
    }

    public static int binaryGap(int N) {
        String s = Integer.toBinaryString(N);
        System.out.println(s);
        int max=0;
        int prev1=-1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                if(-1!=prev1){
                    max=Integer.max(i-prev1,max);
                }
                prev1=i;
            }

        }

        return max;
    }
}
