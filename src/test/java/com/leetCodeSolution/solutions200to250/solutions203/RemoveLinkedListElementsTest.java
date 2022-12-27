package com.leetCodeSolution.solutions200to250.solutions203;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import com.leetCodeSolution.common.ListNode;

public class RemoveLinkedListElementsTest {

    @Test
    void 성공() {
        //given:
        // node = [1,2,6,3,4,5,6] , val = 6
        final ListNode listNode =
                new ListNode(1,
                             new ListNode(2,
                                          new ListNode(6,
                                                       new ListNode(3,
                                                                    new ListNode(4,
                                                                                 new ListNode(5,
                                                                                              new ListNode(
                                                                                                      6)))))));
        final int val = 6;
        //when:
        ListNode result = RemoveLinkedListElements.removeElements(listNode, val);
        //then:
        assertAll(
                () -> assertThat(result.val).isEqualTo(1),
                () -> assertThat(result.next.val).isEqualTo(2),
                () -> assertThat(result.next.next.val).isEqualTo(3),
                () -> assertThat(result.next.next.next.val).isEqualTo(4),
                () -> assertThat(result.next.next.next.next.val).isEqualTo(5)
        );
    }

    @Test
    void 성공_빈_노드() {
        //given:
        // node = [] , val = 1
        final ListNode listNode = new ListNode();
        final int val = 1;
        //when:
        ListNode result = RemoveLinkedListElements.removeElements(listNode, val);
        assertThat(result).isNull();
    }

    @Test
    void 성공_모든_노드_제거() {
        //given:
        // node = [7,7,7,7] , val = 7
        final ListNode listNode = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        final int val = 7;
        //when:
        ListNode result = RemoveLinkedListElements.removeElements(listNode, val);
        assertThat(result).isNull();
    }
}
