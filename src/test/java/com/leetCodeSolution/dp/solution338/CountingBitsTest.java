package com.leetCodeSolution.dp.solution338;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CountingBitsTest {

    @Test
    void test1() {
        //given:
        final int n = 2;
        final int[] expected = { 0, 1, 1 };
        //when:
        final int[] result = CountingBits.countBits(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int n = 5;
        final int[] expected = { 0, 1, 1, 2, 1, 2 };
        //when:
        final int[] result = CountingBits.countBits(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final int n = 15;
        final int[] expected = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
        //when:
        final int[] result = CountingBits.countBits(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test4() {
        //given:
        final int n = 2;
        final int[] expected = { 0, 1, 1 };
        //when:
        final int[] result = CountingBits.countBits2(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test5() {
        //given:
        final int n = 5;
        final int[] expected = { 0, 1, 1, 2, 1, 2 };
        //when:
        final int[] result = CountingBits.countBits2(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test6() {
        //given:
        final int n = 15;
        final int[] expected = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
        //when:
        final int[] result = CountingBits.countBits2(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test7() {
        //given:
        final int n = 0;
        final int[] expected = { 0 };
        //when:
        final int[] result = CountingBits.countBits2(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
