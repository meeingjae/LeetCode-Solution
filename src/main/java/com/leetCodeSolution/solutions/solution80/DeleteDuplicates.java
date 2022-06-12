package com.leetCodeSolution.solutions.solution80;

import com.leetCodeSolution.solutions.solution2.ListNode;

public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
