package org.josebaperu.leetcode.tree;

import org.josebaperu.common.TreeNode;

public class CountNodes {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        TreeNode treeNode2 = new TreeNode(1);
        System.out.println(countNodes(treeNode));
    }
    static int countNodes(TreeNode root) {

        return doHelper(root, 0);
    }
    static int doHelper(TreeNode root, int counter){
        if(root == null)
            return counter;

        return root.val + doHelper(root.left, counter) + doHelper(root.right, counter);
    }
}
