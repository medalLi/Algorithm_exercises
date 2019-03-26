package com.树结构.基本树结构;

import org.junit.Test;

import java.util.*;

/**
 * @author medal
 * @create 2019-03-02 20:51
 **/
public class MyTree implements ITree {

    TreeNode root = null;
    int size = 0;

    public MyTree(TreeNode root){
        this.root = root;
        size ++;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        MyTree my = new MyTree(root);
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

    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public TreeNode getRoot() {
        if(root != null){
            return root;
        }
        return null;

    }

    @Override
    public TreeNode getParent(TreeNode element) {
        return element.parent;
    }

    @Override
    public TreeNode getFirstChild(TreeNode element) {
        return element.childs.get(0);
    }

    @Override
    public TreeNode getNextSibling(TreeNode element) {
        if(element.childs == null){
            return null;
        }
        ArrayList<TreeNode> list = element.childs;
        int index = list.indexOf(element);
        if(index == list.size()-1){
            return null;
        }else{
          return  list.get(index +1);
        }
        //return null;
    }

    @Override
    public int getHeight(TreeNode element) {
        int h =0;
        if(element.childs != null){
            // h = 0;
            ArrayList<TreeNode> list = element.childs;
            for(TreeNode ele : list){
                h = Math.max(h,getHeight(ele));
            }
            return h +1 ;
        }
        return 0;
    }

    @Override
    public boolean contains(TreeNode element) {
        boolean flag = false;
        if(root == null){
            return false;
        }
        return flag;
    }

    @Override
    public void insertChild(TreeNode x, TreeNode element) {
      if(x.childs == null){
          x.childs = new ArrayList<>();
      }
      x.childs.add(element);
      element.parent = x;
      size++;
    }

    @Override
    public void deleteChild(TreeNode element, int i) {
        if(element.childs == null){
            return;
        }
        if(i > element.childs.size()){
            return;
        }
        element.childs.remove(i);
    }

    @Override
    public ArrayList<TreeNode> preOrder(TreeNode element) {
        return null;
    }

    @Override
    public ArrayList<TreeNode> postOrder(TreeNode element) {
        return null;
    }

    @Override
    public ArrayList<TreeNode> levelOrder(TreeNode element) {
        //TreeNode tn = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //System.out.println(element);

        queue.add(element);
        //TreeNode tn1 = queue.pop();
        while (queue.size() >0){
            TreeNode tn1 = queue.poll();
            System.out.println(tn1);
            if(tn1.childs != null){
                for(TreeNode tn : tn1.childs){
                    queue.add(tn);
                }
            }
        }

        return null;
    }
}
