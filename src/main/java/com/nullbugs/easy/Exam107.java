package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exam107 {

    private static List<List<Integer>> list=new LinkedList();

    private static int level = 0;

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return null;
        }
        if(list.get(level)==null){
            list.add(level,new ArrayList<>());
        }
        list.get(level).add(root.val);
        level++;
        levelOrderBottom(root.left);
        levelOrderBottom(root.right);

        level--;
        return list;
    }

    public static void main(String[] args) {
        levelOrderBottom(new TreeNode(1));
    }
}
