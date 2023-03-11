package com.leetCodeSolution.dp.solution96;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class UniqueBinarySearchTreesTest {

    @Test
    void test1() {
        //given:
        final int input = 3;
        final int expected = 5;
        //when:
        final int result = UniqueBinarySearchTrees.numTrees(input);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int input = 1;
        final int expected = 1;
        //when:
        final int result = UniqueBinarySearchTrees.numTrees(input);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
