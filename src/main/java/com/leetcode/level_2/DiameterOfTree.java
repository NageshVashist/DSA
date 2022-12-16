package com.leetcode.level_2;

import trees.TreeNode;

public class DiameterOfTree {
    int max=0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode r=root.right = new TreeNode(3);
        r.left=new TreeNode(4);
        r.right= new TreeNode(5);

        System.out.println(new DiameterOfTree().diameterOfBinaryTree(root));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        hight(root);
        return max;
    }

    public int hight(TreeNode root){
        if(root==null){
            return  0;
        }
        int l = hight(root.left);

        int r = hight(root.right);

        max= Math.max(l+r,max);

        return  Math.max(l,r)+1;
    }


}
