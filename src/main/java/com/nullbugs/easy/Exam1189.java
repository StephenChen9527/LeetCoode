package com.nullbugs.easy;

import java.util.Arrays;

public class Exam1189 {

    public static void main(String[] args) {

    }


    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[5];
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)){
                case 'b':
                    arr[0]++;
                    break;
                case 'a':
                    arr[1]++;
                    break;
                case 'l':
                    arr[2]++;
                    break;
                case 'o':
                    arr[3]++;
                    break;
                case 'n':
                    arr[4]++;
                    break;
            }
        }
        arr[2]/=2;
        arr[3]/=2;
        Arrays.sort(arr);
        return arr[0];
    }
}
