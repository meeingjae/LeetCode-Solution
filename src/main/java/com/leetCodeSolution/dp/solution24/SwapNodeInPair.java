package com.leetCodeSolution.dp.solution24;

import com.leetCodeSolution.common.ListNode;

public class SwapNodeInPair {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = head.next;
        head.next = swapPairs(head.next.next);
        tmp.next = head;
        return tmp;
    }
}
