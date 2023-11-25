package org.josebaperu.leetcode.treenode;

import org.josebaperu.common.TreeNode;

public class SameTree {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1, new TreeNode(2, new TreeNode(3),new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode node2 = new TreeNode(1, new TreeNode(2, new TreeNode(3),new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(isSameTree(node1, node2));
    }
    static boolean isSameTree(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && isSameTree(left.left,right.left) && isSameTree(left.right,right.right) ;
    }
}
