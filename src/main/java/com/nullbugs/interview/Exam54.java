package com.nullbugs.interview;

import com.nullbugs.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam54 {

    public static void main(String[] args) {

        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.left.left.left=new TreeNode(1);
        System.out.println(kthLargest(root,3));
    }

    //排序的二叉树，用前序遍历，即刻得到一个有序的集合，然后通过集合坐标获取即刻。
    static  List<String> list = new ArrayList<>();
    public static int kthLargest(TreeNode root, int k) {
        if(root==null || list.size()==k){
            return -1;
        }
        kthLargest(root.right,k);
        list.add(String.valueOf(root.val));
        kthLargest(root.left,k);
        if(k>list.size()){
            return -1;
        }
        return Integer.valueOf(list.get(k-1));

    }
}
