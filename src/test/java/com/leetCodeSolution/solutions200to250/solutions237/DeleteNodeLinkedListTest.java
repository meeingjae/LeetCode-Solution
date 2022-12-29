package com.leetCodeSolution.solutions200to250.solutions237;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.ListNode;

class DeleteNodeLinkedListTest {

    @Test
    void 생성_성공() {
        //givne: head = [4,5,1,9] , delete node = 5
        ListNode head = new ListNode(4,
                                     new ListNode(5,
                                                  new ListNode(1,
                                                               new ListNode(9))));
        ListNode node = new ListNode(5);
        DeleteNodeLinkedList.deleteNode(head, node);
        assertAll(
                () -> assertThat(head.val).isEqualTo(4),
                () ->  assertThat(head.next.val).isEqualTo(1)
        );
    }
}
