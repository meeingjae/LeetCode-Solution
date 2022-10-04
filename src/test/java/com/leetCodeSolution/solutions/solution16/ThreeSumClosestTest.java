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

    @Test
    void 성공_2() {
        //given:
        int[] nums = {0,0,0};
        int target = 1;
        //when:
        int result = ThreeSumClosest.threeSumClosest(nums, target);
        //then:
        assertThat(result).isEqualTo(0);
    }

    @Test
    void 성공_3() {
        //given:
        int[] nums = {1,1,1,1};
        int target = 4;
        //when:
        int result = ThreeSumClosest.threeSumClosest(nums, target);
        //then:
        assertThat(result).isEqualTo(3);
    }
}
