package com.leetCodeSolution.solutions100to150.solution141;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.ListNode;

public class LinkedListCycleTest {

    @Test
    void success() {
        //given:
        ListNode node = new ListNode(3,
                                     new ListNode(2,
                                                  new ListNode(0,
                                                               new ListNode(-4))));
        //when:
        boolean result = LinkedListCycle.hasCycle(node);
        //then:
        assertThat(result).isTrue();
    }
}
