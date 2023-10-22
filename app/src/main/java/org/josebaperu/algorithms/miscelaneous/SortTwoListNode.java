package org.josebaperu.algorithms.miscelaneous;

import org.josebaperu.algorithms.model.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SortTwoListNode {
    public static void main(String[] args) {
        ListNode n4 = new ListNode(4);
        ListNode n2 = new ListNode(2);
        n2.next = n4;
        ListNode l1= new ListNode( 1);
        l1.next = n2;

        ListNode n3 = new ListNode(3);
        n3.next = n4;
        ListNode l2= new ListNode( 1);
        l2.next = n3;

        mergeTwoLists(l1,l2);
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list =  flatNodes(list1,list2, new ArrayList<>());
        ListNode node = doMerge(null, list,list.size()-1);
        return node;
    }

    static ListNode doMerge(ListNode ln, List<Integer> list, int idx) {
        if(-1 == idx){
            return ln;
        }
        int valByIndex = list.get(idx);
        ListNode parent = new ListNode(valByIndex);
        parent.next = ln;


        return doMerge(parent,list, --idx);
    }


    static List<Integer> flatNodes(ListNode l1, ListNode l2, List<Integer>list){
        boolean isN1 = isValid(l1);
        boolean isN2 = isValid(l2);

        if(!isN2 && !isN1){
            return list;
        }
        if(isN1){
            list.add(l1.val);
        }
        if(isN2){
            list.add(l2.val);
        }
        return flatNodes(l1.next, l2.next, list);
    }
    static boolean isValid(ListNode n){
            return n!= null && n.val != 0;
    }
}
