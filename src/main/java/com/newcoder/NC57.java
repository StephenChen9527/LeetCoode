package com.newcoder;

public class NC57 {

    public static void main(String[] args) {
        int reverse = reverse(-3210);
        System.out.println(reverse);
    }
    public static int reverse (int x) {
        int res = 0;
        while (x!=0){
            int last = x%10;
            int newRes = res * 10 +last;
            if((newRes-last)/10!=res){
                return 0;
            }
            res = newRes;
            x = x/10;
        }
        return res;
    }

}
