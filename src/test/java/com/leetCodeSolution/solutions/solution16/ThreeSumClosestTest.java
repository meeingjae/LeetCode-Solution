package com.leetCodeSolution.solutions.solution16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {

    @Test
    void 성공() {
        //given:
        int[] nums = {-1,2,1,-4};
        int target = 1;
        //when:
        int result = ThreeSumClosest.threeSumClosest(nums, target);
        //then:
        assertThat(result).isEqualTo(2);
    }
}
