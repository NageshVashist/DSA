package com.leetcode.level_1;

import java.util.ArrayList;
import java.util.List;

public class TreeLevelOrderTraversal {
    static  List<List<Integer>>  l = new ArrayList<>();

    public static void main(String[] args) {

        TreeLevelOrderTraversal t = new TreeLevelOrderTraversal();
        TreeNode root = t.new TreeNode(3, t.new TreeNode(9), t.new TreeNode(20, t.new TreeNode(15), t.new TreeNode(7)));

        levelOrder(root,0);
        l.forEach(System.out::println);
    }



    public static void levelOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if(l.size()<level+1){
            l.add(new ArrayList<Integer>());
        }
        l.get(level).add(root.val);
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
