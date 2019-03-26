package com.树结构.二叉树结构.基本二叉树;

/**
 * @author medal
 * @create 2019-03-02 20:08
 **/
public class TreeNode {
    TreeNode parent ;
    //ArrayList<TreeNode> childs = new ArrayList<TreeNode>();
    TreeNode left;
    TreeNode right;
    int  data ;

    public TreeNode(int data, TreeNode parent){

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
