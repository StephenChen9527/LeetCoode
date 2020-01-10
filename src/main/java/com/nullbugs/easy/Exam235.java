package com.nullbugs.easy;

import java.util.LinkedList;
import java.util.Queue;

public class Exam235 {

    LinkedList<Integer> q=new LinkedList<>();
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.pollLast();

    }

    /** Get the top element. */
    public int top() {
        return q.peekLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
