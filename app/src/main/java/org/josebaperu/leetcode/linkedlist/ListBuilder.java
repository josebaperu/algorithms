package org.josebaperu.leetcode.linkedlist;

import org.josebaperu.common.ListNode;

public class ListBuilder {
    public static ListNode build (int[] arr){
        int i = 0;
        ListNode head = new ListNode();
        ListNode node = head;
        while(i < arr.length-1){
            node.val = arr[i];
            ListNode tmp = node;
            tmp.next = new ListNode(arr[i+1]);
            node = tmp.next;
            i++;
        }
        return  head;
    }
}
