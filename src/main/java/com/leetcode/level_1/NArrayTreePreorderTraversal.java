package com.leetcode.level_1;

import java.util.ArrayList;
import java.util.List;

public class NArrayTreePreorderTraversal {
    public static void main(String[] args) {
        ArrayList<Node> l2 = new ArrayList<>();
        l2.add(new Node(5));
        l2.add(new Node(6));

        ArrayList<Node> l1 = new ArrayList<>();
        l1.add(new Node(3, l2));
        l1.add(new Node(2));
        l1.add(new Node(4));

        Node root = new Node(1, l1);

        preorder(root);
    }

    public static List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public static void preorder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
//        System.out.println(root.val);
        if (root.children != null && !root.children.isEmpty()) {
            for (Node c : root.children) {
                preorder(c,list);
            }
        }
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
