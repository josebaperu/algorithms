package org.josebaperu.leetcode.node;

import org.josebaperu.common.ListNode;

public class ReverseList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode node = reverse(l1);
        System.out.println(node);

    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
