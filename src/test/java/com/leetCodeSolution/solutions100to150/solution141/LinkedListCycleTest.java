package com.leetCodeSolution.solutions100to150.solution141;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.ListNode;

public class LinkedListCycleTest {

    @Test
    void success() {
        //given:
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next(node2);
        node2.next(node3);
        node3.next(node4);
        node4.next(node2);
        //when:
        boolean result = LinkedListCycle.hasCycle(node1);
        //then:
        assertThat(result).isTrue();
    }
}
