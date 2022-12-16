package com.leetcode.level_1;

public class MergeTowSortedLists {
    public static void main(String[] args) {
//        ListNode l1= new ListNode(1,new ListNode(3,new ListNode(5)));
//        ListNode l2= new ListNode(1,new ListNode(4,new ListNode(5)));
        ListNode l1= new ListNode(5);
        ListNode l2= new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode lists = mergeTwoLists(l1, l2);
        while (lists!=null){
            System.out.println(lists.val);
            lists=lists.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1!=null && list2==null){
            return list1;
        }
        if(list1==null && list2!=null){
            return list2;
        }
        if(list1==null && list2==null){
            return null;
        }
        ListNode l=new ListNode();
        ListNode r=l;
        while(list1!=null || list2!=null) {

            if (list1.val <= list2.val) {
                l.val = list1.val;
                list1 = list1.next != null ? list1.next : null;

            } else if (list1.val > list2.val) {
                l.val = list2.val;
                list2 = list2.next != null ? list2.next : null;
            }
            if (list1 == null || list2 == null) {
                l.next = list1 == null ? list2 : list1;
                return r;
            }
            l.next = new ListNode();
            l = l.next;
        }
        return r;
    }
}

