package org.josebaperu.algorithms.model;

public class TreeNode {
    int val;
    TreeNode left;

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    TreeNode right;
    public TreeNode(){}
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
