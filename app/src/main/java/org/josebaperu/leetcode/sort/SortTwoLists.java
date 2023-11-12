package org.josebaperu.leetcode.sort;

import org.josebaperu.common.ListNode;

public class SortTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        ListNode result = mergeTwoLists(l1,l2);
        System.out.println(result);
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return SortTwoLists.merge(list1, list2);
    }
    static ListNode merge( ListNode p, ListNode q ) {
        if ( p == null)
            return q;
        else if ( q == null)
            return p;
        else if (p.val < q.val) {
            p.next = merge( p.next, q );
            return p;
        }
        else {
            q.next = merge( p, q.next );
            return q;
        }
    }
}
