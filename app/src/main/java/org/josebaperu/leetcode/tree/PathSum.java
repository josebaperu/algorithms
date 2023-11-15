package org.josebaperu.leetcode.tree;

import org.josebaperu.common.TreeNode;

public class PathSum {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(5, new TreeNode(4, new TreeNode(11,new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null,new TreeNode(1))));
        System.out.println(hasPathSum(node, 22, 0));


    }
    static boolean hasPathSum(TreeNode root, int targetSum, int counter) {
        if(root == null) return false;
        counter += root.val;
        if(counter == targetSum && root.left == null && root.right ==null){
            System.out.println(counter);
            return true;
        }
        return hasPathSum(root.left, targetSum,counter) || hasPathSum(root.right, targetSum,counter);
    }
}
