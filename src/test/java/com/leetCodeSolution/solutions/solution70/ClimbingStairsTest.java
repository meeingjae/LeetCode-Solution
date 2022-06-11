package com.leetCodeSolution.solutions.solution70;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    void 성공() {
        //given:
        int stair = 5;
        //when:
        int result = ClimbingStairs.climbStairs(stair);
        //then:
        assertThat(result)
                .isEqualTo(8);
    }
}
