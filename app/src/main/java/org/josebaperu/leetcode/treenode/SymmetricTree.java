package org.josebaperu.leetcode.treenode;

import org.josebaperu.common.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(3),new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(isSymmetric(node));
    }
    static boolean isSymmetric(TreeNode node) {
        if (null == node) return false;
        return isMirror(node.left, node.right);
    }
    static boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        return left.val == right.val && isMirror(left.right, right.left) && isMirror(left.left, right.right);
    }
}
