package com.nullbugs.easy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exam1374 {
    public String generateTheString(int n) {


        StringBuilder sb =new StringBuilder();
        int x = n%2;
        if(x==0){
            n--;
            sb.append("b");
        }
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }
}
