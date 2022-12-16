package com.leetcode.level_1;

public class AddTwoNumbersLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))));
        ListNode l2 =new ListNode(9,new ListNode(9,new ListNode(9)));
//        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
//        ListNode l2 =new ListNode(5,new ListNode(6,new ListNode(4)));

        ListNode node = solution(l1, l2);
        System.out.println(node);
    }

    public static ListNode solution(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode();
        ListNode root= sumNode;
        while (l1 != null || l2 != null) {
            int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val) + sumNode.val;
            int carry = sum / 10;
            sumNode.val = sum % 10;
            l1=l1==null?l1:l1.next;
            l2=l2==null?l2:l2.next;
            if(l1!=null || l2!=null){
                sumNode.next = new ListNode(carry);
                sumNode = sumNode.next;
            }
            else if(l1==null && l2==null && carry!=0){
                sumNode.next = new ListNode(carry);
                sumNode = sumNode.next;
            }
        }
        return root;
    }
}

