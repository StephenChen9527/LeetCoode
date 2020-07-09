package com.nullbugs.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Exam844 {

    public static void main(String[] args) {
        backspaceCompare("y#fo##f"
                ,"y#f#o##f");
    }

    public static boolean backspaceCompare(String S, String T) {
        if(S.equals(T)){
            return true;
        }
        Deque<Character> l1 = new ArrayDeque<Character>();
        Deque<Character> l2 = new ArrayDeque<Character>();
        int i = 0 ;
        while (i<S.length() || i<T.length()){
            if(i<S.length()){
                char c = S.charAt(i);
                if(c=='#'){
                    if(!l1.isEmpty()){
                        l1.removeLast();
                    }
                }else{
                    l1.addLast(c);
                }
            }
            if(i<T.length()){
                char c = T.charAt(i);
                if(c=='#'){
                    if(!l2.isEmpty()){
                        l2.removeLast();
                    }
                }else{
                    l2.addLast(c);
                }
            }
            i++;
        }
        if(l1.size()!=l2.size()){
            return false;
        }
        while (!l1.isEmpty()){
            if(!l1.removeFirst().equals(l2.removeFirst())){
                return false;
            }
        }
        return true;
    }

}
