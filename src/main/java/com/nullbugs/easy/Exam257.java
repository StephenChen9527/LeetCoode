package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Exam257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            TreeNode top = stack.pop();
            if(top.right!=null){
                stack.push(top.right);
            }
            if(top.left!=null){
                stack.push(top.left);
            }
            if(root.left==null && root.left==null){
                list.add(sb.toString());
            }
        }


        binaryTreePaths(root.left);
        binaryTreePaths(root.right);

        return list;
    }

    public void travel(TreeNode node,StringBuilder sb, List<String> list){

    }

}
