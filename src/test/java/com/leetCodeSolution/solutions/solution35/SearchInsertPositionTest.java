package com.leetCodeSolution.solutions.solution35;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPositionTest {

    @DisplayName("성공")
    @Test
    void 성공() {
        //given:
        int[] nums = {1,2,3,4,5};
        int target = 4;
        //when:
        IntUtil intUtil = new IntUtil(nums);
        int result = intUtil.searchInsert(target);
        //then:
        assertThat(result).isEqualTo(3);
    }
}
