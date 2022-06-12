package com.leetCodeSolution.solutions.solution80;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.solutions.solution2.ListNode;

public class DeleteDuplicatesTest {

    @Test
    void 성공() {
        //given:
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3))));
        //when:
        ListNode result = DeleteDuplicates.deleteDuplicates(head);
        //then:
        assertThat(result.val)
                .isEqualTo(1);
        assertThat(result.next.val)
                .isEqualTo(2);
        assertThat(result.next.next.val)
                .isEqualTo(3);
    }
}
