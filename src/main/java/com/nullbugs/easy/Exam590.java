package com.nullbugs.easy;

import com.nullbugs.util.Node;

import java.util.LinkedList;
import java.util.List;

public class Exam590 {

    public List<Integer> postorder(Node root) {
        List<Integer> list=new LinkedList<>();
        if(root!=null){
            for (int i = 0; i < root.children.size(); i++) {
                list.addAll(postorder(root.children.get(i)));
            }
            list.add(root.val);

        }
        return list;
    }

}
