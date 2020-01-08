package com.nullbugs.easy;

import com.nullbugs.util.TreeNode;

import java.util.Arrays;

public class Exam108 {

    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-12,-10,-3,0,5,9});

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0){
            return null;
        }
        if(nums.length==1){
            return new TreeNode(nums[0]);
        }
        TreeNode treeNode=new TreeNode(nums[nums.length/2]);
        treeNode.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
        treeNode.right=sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
        return treeNode;
    }

}
