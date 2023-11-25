package org.josebaperu.leetcode;

import org.josebaperu.common.TreeNode;

public class FindNodeInTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2, null,null),new TreeNode(3,null,new TreeNode(8)));
        TreeNode ret = searchBST(node, 3);
    }
    static TreeNode searchBST(TreeNode node, int target){
        if(node == null) return null;
        if(node.val == target) return node;
        if(node.val > target){
            return searchBST(node.left,target);
        }
        return searchBST(node.right,target);
    }
}
