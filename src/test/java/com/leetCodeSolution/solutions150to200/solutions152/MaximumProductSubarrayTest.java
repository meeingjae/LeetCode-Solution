package com.leetCodeSolution.solutions150to200.solutions152;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MaximumProductSubarrayTest {

    @Test
    void 성공() {
        //given:
        int[] nums = {2,6,4,3,1,6,7,0,-2};
        //when:
        int result = MaximumProductSubarray.maxProduct(nums);
        //then:
        assertThat(result)
                .isEqualTo(6048);
    }
}
