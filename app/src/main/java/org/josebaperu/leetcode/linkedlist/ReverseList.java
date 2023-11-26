package org.josebaperu.leetcode.linkedlist;

import org.josebaperu.common.ListNode;
import org.josebaperu.utils.ListBuilder;

public class ReverseList {
    public static void main(String[] args) {
        ListNode reversed = reverse(ListBuilder.build(new int[]{1,2,3,4,5,6,7}));
        System.out.println(reversed);
    }
    static  ListNode reverse(ListNode head){
        if(head == null)  return  null;
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        return prev;
    }
}
