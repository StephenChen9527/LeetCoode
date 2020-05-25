package com.nullbugs.easy;

import java.util.List;
import java.util.Stack;

public class Exam232 {

    public static void main(String[] args) {
        Exam232 ex=new Exam232();
        ex.push(1);
        ex.push(2);
        ex.push(3);
        ex.push(4);
        ex.push(5);
        System.out.println(ex.pop());
        System.out.println(ex.pop());
        System.out.println(ex.pop());
        System.out.println(ex.pop());
    }

    private Stack<Integer> dataStack;
    /** Initialize your data structure here. */
    public Exam232() {
        dataStack=new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        //dataStack.add(dataStack.size(),x);
        dataStack.add(0,x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return dataStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return dataStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return dataStack.empty();
    }
}
