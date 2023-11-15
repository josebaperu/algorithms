package org.josebaperu.leetcode.tree;

import org.josebaperu.common.TreeNode;

public class SumOfBinaryTree {
    public static void main(String[] args) {
        //TreeNode node = new TreeNode(1,new TreeNode(3, null, new TreeNode(7)), new TreeNode(4, new TreeNode(8),null));
        TreeNode node = new TreeNode(1,new TreeNode(3, null, new TreeNode(7)), new TreeNode(4, new TreeNode(8),null));

        System.out.println(doSum(node,3,7,0));
    }
    static int doSum(TreeNode node, int min, int max, int sum){
        if(node == null ){
            return sum;
        }

        return isInRange(min,max,node.val) + doSum(node.left, min, max, sum) + doSum(node.right ,min, max, sum);

    }
    static int isInRange(int min, int max, int n){
         return n >= min && n <= max? n:0;
    }
}
