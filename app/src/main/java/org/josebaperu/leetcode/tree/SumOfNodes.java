package org.josebaperu.leetcode.tree;


import org.josebaperu.common.TreeNode;

public class SumOfNodes {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(10, new TreeNode(1), new TreeNode(5));
        System.out.println(doSum(node));
    }

    static boolean doSum(TreeNode node){
        if (node == null) return false;

        return node.val == node.left.val + node.right.val;
    }
}
