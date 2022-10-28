package com.leetCodeSolution.solutions150to200.solutions169;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    @Test
    void example1() {
        //given:
        int[] nums = {3,2,3};
        //when:
        int result = MajorityElement.majorElement(nums);
        //then:
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example2() {
        //given:
        int[] nums = {2,2,1,1,1,2,2};
        //when:
        int result = MajorityElement.majorElement(nums);
        //then:
        assertThat(result).isEqualTo(2);
    }
}
