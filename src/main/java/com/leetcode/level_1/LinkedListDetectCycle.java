package com.leetcode.level_1;


public class LinkedListDetectCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-4);
        ListNode node = new ListNode(2, new ListNode(0, node1));
        node1.next = node;
        ListNode head = new ListNode(3, node);

        System.out.println(detectCycle(head).val);


    }
    public static ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f= head;

        if(null ==head.next)return null;
        while(f !=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                break;
            }
        }

        if(f ==null || f.next!=null) return null;
        while (f!=s){
            f=f.next;
            s=s.next;
        }
        return f;

    }
}
