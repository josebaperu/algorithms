package org.josebaperu.leetcode;

import org.josebaperu.common.ListNode;

public class MergeSortedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        ListNode n = mergeTwoLists(node1, node2);
        System.out.println(n);
    }


    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 ==null)return null;
        if(list1 == null && list2 !=null)return list2;
        if(list1 != null && list2 ==null)return list1;
        ListNode head  = null;


            if(list1.val > list2.val){
                head = list2;
                head.next = mergeTwoLists(list1, list2.next);
            } else {
                head = list1;
                head.next = mergeTwoLists(list1.next, list2);
            }

        return head;
    }
}
