package org.josebaperu.algorithms.miscelaneous;

import org.josebaperu.algorithms.model.TreeNode;
import java.util.Objects;

public class TreeNodeSymmetric {
    public static void main(String[] args) {
        TreeNode three = new TreeNode(3, null,null);
        TreeNode four = new TreeNode(4, null,null);
        TreeNode twoLeft = new TreeNode(2, three,four);
        TreeNode twoRight = new TreeNode(2, four,three);
        TreeNode oneRoot = new TreeNode(1, twoLeft,twoRight);
        System.out.println(isSymmetric(oneRoot));
    }

    static boolean isSymmetric(TreeNode root){
        if(null == root)
            return true;

        return helper(root.getLeft(), root.getRight());
    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left != null && right != null && left.getVal() == right.getVal())
            return helper(left.getLeft(), right.getRight()) && helper(left.getRight(), right.getLeft());
        return false;
    }
}
