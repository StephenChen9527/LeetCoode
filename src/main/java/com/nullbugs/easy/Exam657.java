package com.nullbugs.easy;

public class Exam657 {

    public static void main(String[] args) {
        System.out.println(judgeCircle("1111"));
    }
    public static boolean judgeCircle(String moves) {

        int x=0;
        int y=0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i)=='L')
                x++;
            if(moves.charAt(i)=='R')
                x--;
            if(moves.charAt(i)=='U')
                y++;
            if(moves.charAt(i)=='D')
                y--;

        }
        return x==y?x==0:false;
    }
}
