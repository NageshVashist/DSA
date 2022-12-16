package com.leetcode.level_2;

import trees.Tree;
import trees.TreeNode;

public class InvertedBinaryTree {
    public static void main(String[] args) {
        Tree t = new Tree();
        TreeNode n = t.makeTree();
        n = invertTree(n);
        t.inOrderTraversal(n);
    }

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
