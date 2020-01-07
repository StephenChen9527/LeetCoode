package com.nullbugs.easy;

import java.util.LinkedList;
import java.util.List;
import com.nullbugs.util.Node;
public class Exam589 {
    public static void main(String[] args) {

    }

    public static List<Integer> preorder(Node root) {
        List<Integer> list=new LinkedList<>();
        if(root!=null){
            list.add(root.val);
            for (int i = 0; i < root.children.size(); i++) {
                list.addAll(preorder(root.children.get(i)));
            }

        }
        return list;
    }
}
