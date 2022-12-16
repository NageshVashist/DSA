package com.leetcode.level_2;

import trees.TreeNode;

public class BalancedTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode r=root.right = new TreeNode(20);
        r.left=new TreeNode(15);
        r.right= new TreeNode(7);

        System.out.println(isBalanced(root));

    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;

        return height(root)!=-1;
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = height(root.left);
        if(l==-1){
            return -1;
        }
        int r = height(root.right);
        if(r==-1){
            return -1;
        }
        if(l-r<-1 || l-r>1 ){
            return -1;
        }
        return Math.max(l,r)+1;

    }

}
