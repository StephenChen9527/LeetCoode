package com.nullbugs.interview;

import com.nullbugs.util.TreeNode;

import java.util.Arrays;

/**
 *
 * https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 */
public class Exam04_02 {
    public static void main(String[] args) {
        sortedArrayToBST(new int[]{1,2,3,4,5});
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        if(nums.length==1){
            return new TreeNode(nums[0]);
        }
        int index = nums.length/2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,index));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,index+1,nums.length));
        return root;
    }
}
