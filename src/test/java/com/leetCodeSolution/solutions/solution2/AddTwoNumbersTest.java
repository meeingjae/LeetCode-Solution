package com.leetCodeSolution.solutions.solution2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddTwoNumbersTest {

    @Test
    void addTwoNumbersTest() {

        // given:
        // [1,3,5,7,9]
        ListNode firstNode =
                new ListNode(1,
                        new ListNode(3,
                                new ListNode(5,
                                        new ListNode(7,
                                                new ListNode(9)))));

        // [2,4,6,8,9]
        ListNode secondNode =
                new ListNode(2,
                        new ListNode(4,
                                new ListNode(6,
                                        new ListNode(8,
                                                new ListNode(9)))));

        // when:
        ListNode result = AddTwoNumbers.addTwoNumbers(firstNode, secondNode);

        // then:
        // expect : [3,7,1,6,9,1]
        assert result.val == 3;
        assert result.next.val == 7;
        assert result.next.next.val == 1;
        assert result.next.next.next.val == 6;
        assert result.next.next.next.next.val == 9;
        assert result.next.next.next.next.next.val == 1;
    }
}
