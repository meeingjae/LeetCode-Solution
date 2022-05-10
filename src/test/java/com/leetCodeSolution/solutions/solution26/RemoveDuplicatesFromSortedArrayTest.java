package com.leetCodeSolution.solutions.solution26;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void 성공() {
        //given:
        int[] source = new int[4];
        source[0] = 1;
        source[1] = 1;
        source[2] = 2;
        source[3] = 3;
        //when:
        int result = Solution.removeDuplicates(source);
        //then:
        assertThat(result)
                .isEqualTo(3);
    }
}
