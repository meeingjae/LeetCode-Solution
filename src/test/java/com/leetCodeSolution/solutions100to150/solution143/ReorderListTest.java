package com.leetCodeSolution.solutions100to150.solution143;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.ListNode;

public class ReorderListTest {

    @Test
    void example1() {
        //given:
        ListNode head = new ListNode(1,
                                     new ListNode(2,
                                                  new ListNode(3,
                                                               new ListNode(4))));
        //when:
        ReorderList.reorderList(head);
        //then:
        assertThat(head.next.val).isEqualTo(4);
    }

    @Test
    void example2() {
        //given:
        ListNode head = new ListNode(1,
                                     new ListNode(2,
                                                  new ListNode(3,
                                                               new ListNode(4,
                                                                            new ListNode(5)))));
        //when:
        ReorderList.reorderList(head);
        //then:
        assertThat(head.next.val).isEqualTo(5);
    }
}
