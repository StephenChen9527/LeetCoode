package com.nullbugs.easy;

/**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 */
public class Exam1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }
    public static int balancedStringSplit(String s) {
        int count = 0;
        int step = 1;
        for (int i = 0; i < s.length()-1; ) {
            if(s.charAt(i)!=s.charAt(i+1)){
                i+=step;
                step=1;
                count++;
                continue;
            }
            step++;
            i++;
        }
        return count;
    }


}
