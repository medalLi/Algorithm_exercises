package com.树结构.二叉树结构.基本二叉树;

import java.util.ArrayList;

/**
 * @author medal
 * @create 2019-03-02 20:15
 **/
public interface IBanaryTree {

    //获取树的总结点数
    int getSize();

    //获取树的根节点
    TreeNode getRoot();

    //获取传入结点的父节点
    TreeNode getParent(TreeNode element);

    //获取传入结点的左孩子
    TreeNode getFirstChild(TreeNode element);


    //获取树的高度
    int getHeight(TreeNode element);

    //判断树中是否包含某一结点
    boolean contains(TreeNode element);

    //插入子结点
    void insertChild(TreeNode x, TreeNode element);

    //删除传入的结点
    void deleteChild(TreeNode element);

    //前序遍历树
    ArrayList<TreeNode> preOrder(TreeNode element);

    //后序遍历树
    ArrayList<TreeNode> postOrder(TreeNode element);

    //层次遍历树
    ArrayList<TreeNode> levelOrder(TreeNode element);

}
