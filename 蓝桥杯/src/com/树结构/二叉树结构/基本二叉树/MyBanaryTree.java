package com.树结构.二叉树结构.基本二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author medal
 * @create 2019-03-02 20:51
 **/
public class MyBanaryTree implements  IBanaryTree {

    TreeNode root = null;
    int size = 0;

    public MyBanaryTree(TreeNode root){
        this.root = root;
        size ++;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        MyBanaryTree my = new MyBanaryTree(root);
        TreeNode tn2 = new TreeNode(2);
        my.insertChild(root,tn2);
        TreeNode tn3 = new TreeNode(3);
        my.insertChild(root,tn3);
        TreeNode tn4 = new TreeNode(4);
        my.insertChild(tn2,tn4);
        TreeNode tn5 = new TreeNode(5);
        my.insertChild(tn2,tn5);
        TreeNode tn6 = new TreeNode(6);
        my.insertChild(tn3,tn6);
        TreeNode tn7 = new TreeNode(7);
        my.insertChild(tn4,tn7);
        TreeNode tn8 = new TreeNode(8);
        my.insertChild(tn7,tn8);
        TreeNode tn9 = new TreeNode(9);
        my.insertChild(tn8,tn9);

        //TreeNode tn1 = new TreeNode(2,root);
//        System.out.println(my.getHeight(root)-1);
//        System.out.println(my.getRoot());
//        System.out.println(my.getSize());
//        System.out.println(my.getFirstChild(tn2));
//        System.out.println(my.getParent(tn5));
        my.levelOrder(root);
        //my.preOrder(root);
           // my.postOrder(root);
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public TreeNode getRoot() {
        return root;
    }

    @Override
    public TreeNode getParent(TreeNode element) {
        return element.parent;
    }

    @Override
    public TreeNode getFirstChild(TreeNode element) {
        return element.left;
    }

    @Override
    public int getHeight(TreeNode element) {
        int h= 0;
       // TreeNode tn = root;
        if(element.left != null){
            h = Math.max(h,getHeight(element.left));
        }
        if(element.right != null){
            h = Math.max(h,getHeight(element.right));
        }
        return h +1;
    }

    @Override
    public boolean contains(TreeNode element) {
        return false;
    }

    @Override
    public void insertChild(TreeNode x, TreeNode element) {
        if(x.left == null ){
            x.left = element;
            element.parent = x;

        }else{
            x.right = element;
            element.parent = x;
        }
    }

    @Override
    public void deleteChild(TreeNode element) {

    }

    @Override
    public ArrayList<TreeNode> preOrder(TreeNode element) {
        if(element != null){
            System.out.println(element);
            preOrder(element.left);
            preOrder(element.right);
        }
        return null;
    }

    @Override
    public ArrayList<TreeNode> postOrder(TreeNode element) {
        if(element != null){
            postOrder(element.left);
            postOrder(element.right);
            System.out.println(element);
        }
        return null;
    }

    @Override
    public ArrayList<TreeNode> levelOrder(TreeNode element) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(element);
        while(queue.size() >0){
            TreeNode tn = queue.poll();
            System.out.println(tn);
            if(tn.left != null){
                queue.add(tn.left);
            }
            if(tn.right != null){
                queue.add(tn.right);
            }
        }
        return null;
    }
}
