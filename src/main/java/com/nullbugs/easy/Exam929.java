package com.nullbugs.easy;

import java.util.HashSet;
import java.util.Set;

public class Exam929 {
    public static void main(String[] args) {
        numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> str = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] split = emails[i].split("@");
            String s = split[0].replaceAll("\\.", "");
            if(s.indexOf("+")>-1){
                s= s.substring(0,s.indexOf("+"));
            }
            str.add(s+"@"+split[1]);
        }

        return str.size();
    }
}
