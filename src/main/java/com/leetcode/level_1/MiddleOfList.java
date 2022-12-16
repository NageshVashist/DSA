package com.leetcode.level_1;

public class MiddleOfList {
    public static void main(String[] args) {
        ListNode slow=ListNode.getList(2);
        ListNode lists = middleNode(slow);
        while (lists!=null){
            System.out.println(lists.val);
            lists=lists.next;
        }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null)
                break;
        }
        head = slow;
        return head;
    }
}
