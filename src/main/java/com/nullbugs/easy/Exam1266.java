package com.nullbugs.easy;

/**
 * ....切比雪夫距离 之前不知道
 *
 * 我认为就一个坐标 xy相减，取最大。。。
 */
public class Exam1266 {

    public static void main(String[] args) {
        int[][] points=new int[3][4];
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int len=0;
        for (int i=0;i<points.length-1;i++){

            len+=(points[i][0]>points[i+1][0]?points[i][0]-points[i+1][0]:points[i+1][0]-points[i][0])  //x的差值 正值
                    >
                  (points[i][1]>points[i+1][1]?points[i][1]-points[i+1][1]:points[i+1][1]-points[i][1]) //y的差值 正值
                    ?
                    (points[i][0]>points[i+1][0]?points[i][0]-points[i+1][0]:points[i+1][0]-points[i][0])
                    :
                    (points[i][1]>points[i+1][1]?points[i][1]-points[i+1][1]:points[i+1][1]-points[i][1]);
        }
        return len;
    }
}
