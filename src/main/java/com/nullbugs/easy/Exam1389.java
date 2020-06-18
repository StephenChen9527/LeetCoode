package com.nullbugs.easy;

import java.util.LinkedList;
import java.util.List;

public class Exam1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> list =new LinkedList<>();
        for (int i = 0; i < index.length; i++) {
            if(index[i]>list.size()){
                list.add(nums[i]);
            }else {
                list.add(index[i],nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            target[i]=list.get(i);
        }
        return target;
    }
}
