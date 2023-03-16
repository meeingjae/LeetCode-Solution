package com.leetCodeSolution.dp.solution221;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaximalSquareTest {

    @ParameterizedTest
    @MethodSource("provideSource")
    void test(int[][] matrix, int expected) {

        //when:
        final int result = MaximalSquare.maximalSquare(matrix);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                Arguments.of(new int[][] {
                        { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1, }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 }
                }, 4),
                Arguments.of(new int[][] { { 0, 1 }, { 1, 0 } }, 1),
                Arguments.of(new int[][] { { 0 } }, 0)
        );
    }
}
