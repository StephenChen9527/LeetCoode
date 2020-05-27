package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;
import sun.reflect.generics.tree.ReturnType;

import java.util.ArrayList;
import java.util.List;

public class Exam637 {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        averageOfLevels(root);

    }
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        List<Integer> counter = new ArrayList<>();
        List<Double> sum = new ArrayList<>();
        sumTreeBST(root,1,sum,counter);
        for (int i = 0; i < sum.size(); i++) {
            list.add(sum.get(i)/counter.get(i));
        }
        return list;
    }

    public static  void sumTreeBST(TreeNode root,int level,List<Double> list,List<Integer> counter){
        if(root==null){
            return ;
        }
        if(list.size()<level){
            list.add(level-1,Double.valueOf(root.val));
            counter.add(level-1,1);
        }else{
            list.set(level-1,list.get(level-1)+root.val);
            counter.set(level-1,counter.get(level-1)+1);
        }
        sumTreeBST(root.left,level+1,list,counter);
        sumTreeBST(root.right,level+1,list,counter);
    }
}
