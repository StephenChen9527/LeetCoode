package com.newcoder;

import java.util.Stack;

public class NC52 {

    public boolean isValid (String s) {
        // write code here

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '}'){
                if(stack.size() ==0 || stack.pop()!='{'){
                    return false;
                }
            }else if(c == ']'){
                if(stack.size() ==0 || stack.pop()!='['){
                    return false;
                }
            }else if(c == ')'){
                if(stack.size() ==0 || stack.pop()!='('){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

}
