package org.josebaperu.leetcode.tree;

import org.josebaperu.common.TreeNode;

public class MinDepth {
    public static void main(String[] args) {
        //[2,null,3,null,4,null,5,null,6]
        TreeNode node = new TreeNode(3, new TreeNode(9, new TreeNode(2), null), null);
        System.out.println(getMinDepth(node,0, 0));//3

        //TreeNode node1 = new TreeNode(3, new TreeNode(9, new TreeNode(2, new TreeNode(3,null,null),null), null), null);
        //System.out.println(getMinDepth(node1,0));//4



    }
    static int getMinDepth(TreeNode root, int counterR,int counterL) {
        if(root == null) return Math.min(counterR,counterL);
        System.out.println(counterL + " "+counterR);
        if(root.right == null && root.left == null)
            return Math.min(counterR,counterL);

        if(root.right == null && root.left != null)
            return  getMinDepth(root.left, ++counterL, counterR);
        if(root.right != null && root.left == null)
            return  getMinDepth(root.right, counterL, ++counterR);
        return Math.min(counterR,counterL);

    }
}
