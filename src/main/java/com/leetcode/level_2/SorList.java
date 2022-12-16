package com.leetcode.level_2;

import com.leetcode.level_1.ListNode;


public class SorList {
    public static void main(String[] args) {
        ListNode l = new ListNode(3, new ListNode(5,
                new ListNode(1, new ListNode(2,
                        new ListNode(6, new ListNode(9,
                                new ListNode(4, new ListNode(7,
                                        new ListNode(8, new ListNode(10))))))))));
        l=sortList(l);
        while (l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode p = l;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p=p.next;
        }
        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return l.next;
    }
}
