package com.leetCodeSolution.solutions150to200.solutions153;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MinRotatedSortedArrayTest {

    @Test
    void 성공() {
        //given:
        int[] nums = {11, 13, 15, 20};
        //when:
        int result = MinRotatedSortedArray.findMin(nums);
        //then:
        assertThat(result)
                .isEqualTo(11);
    }
}
