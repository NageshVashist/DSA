package com.leetcode.level_1;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode lists= new ListNode(1,new ListNode(3,new ListNode(5)));
        lists=reverseList(lists);
        while (lists!=null){
            System.out.println(lists.val);
            lists=lists.next;
        }
    }
    public static ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode node= reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return node;
    }
}
