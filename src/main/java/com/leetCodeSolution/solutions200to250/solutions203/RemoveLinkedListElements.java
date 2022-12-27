package com.leetCodeSolution.solutions200to250.solutions203;

import com.leetCodeSolution.common.ListNode;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode listNode, int val) {
        if (listNode == null || listNode.equals(new ListNode())) {
            return null;
        }
        return remove(listNode, val);
    }

    private static ListNode remove(ListNode listNode, int val) {
        if (listNode == null) {
            return null;
        }
        if (listNode.val == val) {
            return remove(listNode.next, val);
        }
        return new ListNode(listNode.val, remove(listNode.next, val));
    }
}
