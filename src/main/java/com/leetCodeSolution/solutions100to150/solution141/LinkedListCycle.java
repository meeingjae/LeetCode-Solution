package com.leetCodeSolution.solutions100to150.solution141;

import com.leetCodeSolution.common.ListNode;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode node) {
        ListNode walker = node;
        ListNode runner = node;
        while (runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) {return true;}
        }
        return false;
    }
}
