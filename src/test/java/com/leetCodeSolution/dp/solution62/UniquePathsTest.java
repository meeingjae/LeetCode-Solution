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
        final int result = UniquePaths.uniquePaths(m, n);
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
        final int result = UniquePaths.uniquePaths(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final int m = 51;
        final int n = 9;
        final int expected = 1916797311;
        //when:
        final int result = UniquePaths.uniquePaths(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test4() {
        //given:
        final int m = 3;
        final int n = 7;
        final int expected = 28;
        //when:
        final int result = UniquePaths.memoization(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test5() {
        //given:
        final int m = 3;
        final int n = 2;
        final int expected = 3;
        //when:
        final int result = UniquePaths.memoization(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test6() {
        //given:
        final int m = 51;
        final int n = 9;
        final int expected = 1916797311;
        //when:
        final int result = UniquePaths.memoization(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test7() {
        //given:
        final int m = 3;
        final int n = 7;
        final int expected = 28;
        //when:
        final int result = UniquePaths.dp(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test8() {
        //given:
        final int m = 3;
        final int n = 2;
        final int expected = 3;
        //when:
        final int result = UniquePaths.dp(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test9() {
        //given:
        final int m = 51;
        final int n = 9;
        final int expected = 1916797311;
        //when:
        final int result = UniquePaths.dp(m, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
