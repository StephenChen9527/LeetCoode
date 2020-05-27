package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exam107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new LinkedList();
        travel(root,1,list);
        return list;
    }

    public void travel(TreeNode root,int level,List<List<Integer>> list) {
        if(root==null){
            return ;
        }
        if(level>list.size()){
            list.add(0,new ArrayList<Integer>());
        }
        list.get(list.size()-level).add(root.val);
        travel(root.left,level+1,list);
        travel(root.right,level+1,list);
    }

}
