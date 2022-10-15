package com.leetCodeSolution.solutions100to150.solution141;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.list;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.ListNode;

public class LinkedListCycleTest {

    @Test
    void example1() {
        //given:
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        //when:
        node1.next(node2);
        node2.next(node3);
        node3.next(node4);
        node4.next(node2);
        boolean result = LinkedListCycle.hasCycle(node1);
        //then:
        assertThat(result).isTrue();
    }

    @Test
    void example2() {
        //given:
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        //when:
        node1.next(node2);
        node2.next(node1);
        boolean result = LinkedListCycle.hasCycle(node1);
        //then:
        assertThat(result).isTrue();
    }

    @Test
    void example3() {
        //given:
        ListNode node1 = new ListNode(1);
        //when:
        boolean result = LinkedListCycle.hasCycle(node1);
        //then:
        assertThat(result).isFalse();
    }
}
