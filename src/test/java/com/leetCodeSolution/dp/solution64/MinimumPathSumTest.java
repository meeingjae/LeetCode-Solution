package com.leetCodeSolution.dp.solution64;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MinimumPathSumTest {

    @Test
    void test1() {
        //given:
        final int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        final int expected = 7;
        //when:
        final int result = MinimumPathSum.minPathSum(grid);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int[][] grid = {{1,2,3,},{4,5,6}};
        final int expected = 12;
        //when:
        final int result = MinimumPathSum.minPathSum(grid);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
