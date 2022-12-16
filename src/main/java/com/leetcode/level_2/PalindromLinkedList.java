package com.leetcode.level_2;

import com.leetcode.level_1.ListNode;

import java.util.LinkedList;

public class PalindromLinkedList {
    public static void main(String[] args) {
        ListNode l = ListNode.getPalindromList(5);
        ListNode l1 = new ListNode(1, new ListNode(2));

        System.out.println(isPalindrome(l));
        System.out.println(isPalindrome(l1));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode s =head;
        ListNode f=head;
//        find mid
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
//        reverse the list from mid
        f= reverseList(s);
        while (head!=null && f!=null)
        {
            if(head.val!=f.val){
                return false;
            }
            head=head.next;
            f=f.next;
        }
       return true;
    }
    public static ListNode reverseList(ListNode head){
        ListNode current=head;
        ListNode prev= null;
        ListNode next=current.next;

        while (current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }

        }

        return prev;
    }


}
