package org.josebaperu.leetcode.treenode;

import org.josebaperu.common.TreeNode;

public class SumRangeTreeNode {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,new TreeNode(6, new TreeNode(8), new TreeNode(10)), new TreeNode(3, new TreeNode(16), new TreeNode(22)));
        System.out.println(doFindRangeSum(node, 5,15));
    }
    static int doFindRangeSum(TreeNode node, int low, int high){
        return rangeSumBST(node,low,high);
    }
    static int rangeSumBST(TreeNode root, int low, int high){
        int sum = 0;

        if(root == null) {
            return 0;
        }
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if(root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if(root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}
