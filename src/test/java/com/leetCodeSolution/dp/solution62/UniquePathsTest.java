package com.leetCodeSolution.dp.solution62;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class UniquePathsTest {

    @Test
    void test1() {
        //given:
        final int m = 3;
        final int n = 7;
        final int expected = 28;
        //when:
        final int result = UniquePaths.uniquePaths(m,n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int m = 3;
        final int n = 2;
        final int expected = 3;
        //when:
        final int result = UniquePaths.uniquePaths(m,n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
