package org.josebaperu.leetcode.tree;

import org.josebaperu.common.TreeNode;

public class MirrorTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);

        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

        node.left.right = new TreeNode(4);
        node.left.left = new TreeNode(3);
        System.out.println(doCheckMirror(node));
    }
    static boolean doCheckMirror(TreeNode node) {
        if (node == null) return false;
        return isMirror(node.left, node.right) ;
    }

    static boolean isMirror(TreeNode left, TreeNode right){
        if (left == null && right == null)
            return true;


        if (left != null && right != null
                && left.val == right.val)
            return (isMirror(left.left, right.right)
                    && isMirror(left.right, right.left));

        return false;
    }

}
