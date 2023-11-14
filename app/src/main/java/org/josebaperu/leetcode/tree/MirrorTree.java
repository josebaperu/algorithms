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
        System.out.println(doCheckSymmetry(node));
    }https://leetcode.com/problems/symmetric-tree/
    static boolean doCheckMirror(TreeNode head){
            if(head == null){
                return false;
            }
            if(head.left.val == head.right.val)

        return doCheckSymmetry(head.left) == doCheckSymmetry( head.right);
    }

}
