package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam671 {
    public static void main(String[] args) {

    }
    public static int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set= new TreeSet<>();
        int i = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if(i==1){
                return iterator.next();
            }
            i++;
        }
        return -1;
    }
    public static void travel(TreeNode root,Set<Integer> set){
        if(root==null){
            return ;
        }
        set.add(root.val);
        travel(root.left,set);
        travel(root.right,set);
    }
}
