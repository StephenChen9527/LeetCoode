package com.newcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 现在有一个只包含数字的字符串，将该字符串转化成IP地址的形式，返回所有可能的情况。
 * 例如：
 * 给出的字符串为"25525522135",
 * 返回["255.255.22.135", "255.255.221.35"]. (顺序没有关系)
 */
public class NC20 {

    public static void main(String[] args) {
        restoreIpAddresses("010010");
    }
    public static ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        //["0.10.0.10","0.100.1.0"]
        ArrayList<String> list = new ArrayList<>();
        restoreIpAddresses(s,"",list,0);
        System.out.println(list);
        return list;
    }
    public static void restoreIpAddresses (String s,String sb,ArrayList list,int point){
        if(point>3 || s == "" || s.length()==0 ) return;
        if(point!=0 && s.startsWith("0")) return;
        if(sb.startsWith("0") && !sb.startsWith("0.")){
            return;
        }
        if(point==3){
            if(Integer.valueOf(s)>255){
                return;
            }else{
                list.add(sb+=s);
            }
        }if(point<3 && s.length()>0){
            int len = 4;
            while (len > 1){
                len--;
                if(len>s.length()){
                    continue;
                }
                String curStr = s.substring(0, len);
                if(Integer.valueOf(curStr)>255){
                    continue;
                }
                String nextStr = s.substring(len);
                if(len>1 && curStr.startsWith("0") ){
                    continue;
                }
                restoreIpAddresses(nextStr,sb+curStr+".",list,point+1);
            }
        }
    }
}
