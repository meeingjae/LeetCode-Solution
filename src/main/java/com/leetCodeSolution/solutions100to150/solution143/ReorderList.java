package com.leetCodeSolution.solutions100to150.solution143;

import java.util.Stack;

import com.leetCodeSolution.common.ListNode;

public class ReorderList {
    public static void reorderList(ListNode head) {
        ListNode middle = middleNode(head);
        Stack<ListNode> stack = new Stack<>();
        while (middle != null) {
            stack.push(middle);
            middle = middle.next;
        }
        while (!stack.isEmpty()) {
            ListNode tmp = head.next;
            head.next = stack.pop();
            head.next.next = tmp;
            head = head.next.next;
        }
        head.next = null;
    }

    private static ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p2;
    }
}
