package com.leetCodeSolution.solutions.solution18;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FourSumTest {

    @Test
    void fourSumTest() {
        //given:
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        //when:
        List<List<Integer>> result = FourSum.sum(nums, target);
        //then:
        assertThat(result).containsSequence(
                Arrays.asList(
                        Arrays.asList(-2, -1, 1, 2),
                        Arrays.asList(-2, 0, 0, 2),
                        Arrays.asList(-1, 0, 0, 1)));
    }
}
