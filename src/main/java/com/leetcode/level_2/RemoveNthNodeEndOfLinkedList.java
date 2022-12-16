package com.leetcode.level_2;

import com.leetcode.level_1.ListNode;

public class RemoveNthNodeEndOfLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.getList(1);
        head=removeNthFromEnd(head,1);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode s = head;
        ListNode e = head;
        while (n > 0 && e!=null) {
            e = e.next;
            n--;
        }

        if(e==null){
            head=s.next;
        }
        else {
            while (e != null && e.next != null) {
                s = s.next;
                e = e.next;
            }
            s.next = s.next.next;
        }
        return head;
    }
}
