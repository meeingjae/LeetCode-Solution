package com.leetCodeSolution.solutions.solution15;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ThreeSumTest {

    @Test
    void 성공() {
        //given:
        int[] input = { -1, 0, 1, 2, -1, -4 };
        //when:
        List<List<Integer>> result = ThreeSum.sum(input);
        //then:
        assertThat(result).hasSize(2);
        assertThat(result.get(0)).hasSize(3);
        assertThat(result.get(1)).hasSize(3);
        assertThat(result.get(0)).containsSequence(-1, -1, 2);
        assertThat(result.get(1)).containsSequence(-1, 0, 1);
    }
}
