package com.leetCodeSolution.solutions.solution53;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSubarrayTest {

    @DisplayName("Maximum Subarray - 성공")
    @Test
    public void 성공() {
        //given:
        int[] nums = {1,-3,2,7,-4,1,8};
        //when:
        int result = MaximumSubarray.maxSubArray(nums);
        //then:
        assertThat(result)
                .isEqualTo(14); //{7,-4,1,8}
    }
}
