package com.leetCodeSolution.dp.solution746;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MinCostClimbingStairsTest {

    @Test
    void test1() {
        //given:
        final int[] cost = { 10, 15, 20 };
        final int expected = 15;
        //when:
        final int result = MinCostClimbingStairs.minCostClimbingStairs(cost);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        final int expected = 6;
        //when:
        final int result = MinCostClimbingStairs.minCostClimbingStairs(cost);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
