package com.nullbugs.easy;

import java.util.HashMap;
import java.util.Map;

public class Exam860 {

    public static void main(String[] args) {
        lemonadeChange(new int[]{5,5,5,10,5,5,10,20,20,20});
    }
    public static boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i]==20){
                if(ten==0){
                    if(five<3){
                        return false;
                    }
                    five-=3;
                }
                if(ten>0){
                    if(five<1){
                        return false;
                    }
                    five--;
                    ten--;
                }
            }
            if(bills[i]==10){
                if(five<1){
                    return false;
                }
                five--;
                ten++;

            }
            if(bills[i]==5){
                five++;
            }
        }
        return true;
    }

}
