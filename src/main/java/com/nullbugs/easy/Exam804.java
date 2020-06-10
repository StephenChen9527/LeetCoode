package com.nullbugs.easy;

import java.util.*;

public class Exam804 {
    public static void main(String[] args) {
        uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
    }
    public static int uniqueMorseRepresentations(String[] words) {
        List<String> strings = Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..");

        Set<String> set =new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < chars.length; j++) {
                sb.append(strings.get((chars[j])-'a'));
            }
            set.add(sb.toString());
        }
        return set.size();

    }

}
