package com.leetcode.level_1;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getList(int size) {
        ListNode root = new ListNode();
        ListNode node = root;

        for (int i = 1; i <= size; i++) {
            node.val = i;
            if (size - i > 0) {
                node.next = new ListNode();
                node = node.next;
            }
        }
        return root;
    }

    public static ListNode getPalindromList(int size) {
        ListNode root = new ListNode();
        ListNode node = root;
        int i = 1;
        for (; i <= size / 2; i++) {
            node.val = i;
            node.next = new ListNode();
            node = node.next;

        }
        i--;
        for (; i >= 1; i--) {
            node.val = i;
            if(i>1) {
                node.next = new ListNode();
                node = node.next;
            }
        }
        return root;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
