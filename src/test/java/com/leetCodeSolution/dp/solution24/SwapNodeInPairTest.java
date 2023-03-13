package com.leetCodeSolution.dp.solution24;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.ListNode;

public class SwapNodeInPairTest {

    @Test
    void test1() {
        //given:
        final ListNode head = new ListNode(1,
                                           new ListNode(2,
                                                        new ListNode(3,
                                                                     new ListNode(4))));
        //when:
        final ListNode result = SwapNodeInPair.swapPairs(head);
        //then:
        assertThat(result.val).isEqualTo(2);
        assertThat(result.next.val).isEqualTo(1);
        assertThat(result.next.next.val).isEqualTo(4);
        assertThat(result.next.next.next.val).isEqualTo(3);
    }

    @Test
    void test2() {
        //given:
        final ListNode head = new ListNode();
        //when:
        final ListNode result = SwapNodeInPair.swapPairs(head);
        //then:
        assertThat(result.val).isNull();
    }

    @Test
    void test3() {
        //given:
        final ListNode head = new ListNode(1);
        //when:
        final ListNode result = SwapNodeInPair.swapPairs(head);
        //then:
        assertThat(result.val).isEqualTo(1);
    }
}
