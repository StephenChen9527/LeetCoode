package com.nullbugs.easy;

import com.nullbugs.util.Node;

public class Exam559 {

    public int maxDepth(Node root) {
        int max=0;
        if(root==null){
            return max;
        }
        max++;
        if(root.children==null || root.children.size()==0){
            return 1;
        }
        int left=0;
        int mid=0;
        int right=0;
        for (int i = 0; i < root.children.size(); i++) {
            if(i==0){
                left=maxDepth(root.children.get(i));
            }
            if(i==1){
                mid=maxDepth(root.children.get(i));
            }
            if(i==2){
                right=maxDepth(root.children.get(i));
            }
        }

        return max+Integer.max(Integer.max(left,right),mid);
    }
}
