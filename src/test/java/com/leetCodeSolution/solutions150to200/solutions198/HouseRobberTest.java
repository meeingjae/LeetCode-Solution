package com.leetCodeSolution.solutions150to200.solutions198;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HouseRobberTest {

    @Test
    void 성공() {
        //given:
        int[] nums = {1,2,3,1};
        //when:
        int result = HouseRobber.rob(nums);
        //then:
        assertThat(result).isEqualTo(4);
    }

    @Test
    void 성공_case2() {
        //given:
        int[] nums = {2,7,9,3,1};
        //when:
        int result = HouseRobber.rob(nums);
        //then:
        assertThat(result).isEqualTo(12);
    }
}
