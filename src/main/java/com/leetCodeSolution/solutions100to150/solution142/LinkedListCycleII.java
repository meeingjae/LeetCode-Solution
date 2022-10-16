package com.leetCodeSolution.solutions100to150.solution142;

import java.util.HashSet;
import java.util.Set;

import com.leetCodeSolution.common.ListNode;

public class LinkedListCycleII {
    public static ListNode hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        Set<Integer> valueSet = new HashSet<>();
        valueSet.add(head.val);
        return hasCycle(head.next, valueSet);
    }

    public static ListNode hasCycle(ListNode node, Set<Integer> set) {
        if (set.contains(node.val)) {
            return node;
        } else if (node.next != null) {
            set.add(node.val);
            return hasCycle(node.next, set);
        } else {
            return null;
        }
    }
}
