package com.leetcode.level_2;

import com.leetcode.level_1.ListNode;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode n = ListNode.getList(10);
        n=OddEvenLinkedList.oddEvenList(n);
        while(n!=null){
            System.out.println(n.val);
            n=n.next;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            even.next=odd.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;

    }
}
