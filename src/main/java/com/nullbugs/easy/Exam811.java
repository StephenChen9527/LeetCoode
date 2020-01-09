package com.nullbugs.easy;

import java.util.*;
import java.util.stream.Stream;

public class Exam811 {

    public static void main(String[] args) {
        String[] str=new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        subdomainVisits(str);
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] s = cpdomains[i].split(" ");
            int count =Integer.valueOf(s[0]);
            map.put(s[1],count+map.getOrDefault(s[1],0));
            while (s[1].indexOf(".")!=-1){
                s[1]=s[1].substring(s[1].indexOf(".")+1, s[1].length());
                map.put(s[1],count+map.getOrDefault(s[1],0));
            }
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
            String key=it.next();
            list.add(map.get(key)+" "+key);
        }
        return list;
    }
}
