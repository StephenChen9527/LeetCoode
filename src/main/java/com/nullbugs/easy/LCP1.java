package com.nullbugs.easy;

/**
 * LCP1 猜数字
 *
 *  easy
 * guess的长度 = 3
 * answer的长度 = 3
 * guess的元素取值为 {1, 2, 3} 之一。
 * answer的元素取值为 {1, 2, 3} 之一。
 */
public class LCP1 {
    public static void main(String[] args) {

    }

    /**
     * 无脑循环 answer， 去匹配guess中的。。。几次就是几次..。
     * very  easy
     * @param guess
     * @param answer
     * @return
     */
    public int game(int[] guess, int[] answer) {
        int result=0;
        for(int i=0;i<guess.length;i++){
            result+=guess[i]==answer[i]?1:0;
        }
        return result;

    }
}
