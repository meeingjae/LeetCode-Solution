package com.mergetwosortedlists;

import com.mergetwosortedlists.solution.ListNode;
import com.mergetwosortedlists.solution.Solution;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

    @Test
    void 성공() {
        //given:
        ListNode list1 = new ListNode(3, new ListNode(5, new ListNode(9)));
        ListNode list2 = new ListNode(4, new ListNode(6, new ListNode(8)));
        //when:
        ListNode result = Solution.mergeTwoLists(list1, list2);
        //then:
        assertThat(result.next.next.next.val)
                .isEqualTo(6);
    }

}
