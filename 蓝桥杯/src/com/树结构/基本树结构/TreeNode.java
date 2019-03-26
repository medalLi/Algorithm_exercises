package com.树结构.基本树结构;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author medal
 * @create 2019-03-02 20:08
 **/
public class TreeNode {
    TreeNode parent ;
    ArrayList<TreeNode> childs = new ArrayList<TreeNode>();

    int  data ;

    public TreeNode(int data,TreeNode parent){

        this.data = data;
        this.parent = parent;
    }
    public TreeNode(int data){

        this.data = data;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
