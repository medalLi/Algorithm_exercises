package com.树结构.基本树结构;

import java.util.ArrayList;

/**
 * @author medal
 * @create 2019-03-02 20:15
 **/
public interface ITree {

    //获取树的总结点数
    int getSize();

    //获取树的根节点
    TreeNode getRoot();

    //获取传入结点的父节点
    TreeNode getParent(TreeNode element);

    //获取传入结点的第一个孩子
    TreeNode getFirstChild(TreeNode element);

    //获取传入结点的兄弟结点
    TreeNode getNextSibling(TreeNode element);

    //获取树的高度
    int getHeight(TreeNode element);

    //判断树中是否包含某一结点
    boolean contains(TreeNode element);

    //插入子结点
    void insertChild(TreeNode x,TreeNode element);

    //删除传入结点的第i个孩子
    void deleteChild(TreeNode element,int i);

    //前序遍历树
    ArrayList<TreeNode> preOrder(TreeNode element);

    //后序遍历树
    ArrayList<TreeNode> postOrder(TreeNode element);

    //层次遍历树
    ArrayList<TreeNode> levelOrder(TreeNode element);

}
