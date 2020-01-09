package com.nullbugs.easy;

public class Exam509 {

    public int fib(int N) {
        if(N<2){
            return N;
        }
        return fib(N-1)+fib(N-2);
    }
}
