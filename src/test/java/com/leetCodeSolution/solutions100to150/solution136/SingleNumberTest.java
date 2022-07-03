package com.leetCodeSolution.solutions100to150.solution136;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    @Test
    void 성공() {
        //given:
        int[] nums = {1,4,4,5,5,7,1,9,9};
        //when:
        int result = SingleNumber.singleNumber(nums);
        //then:
        assertThat(result)
                .isEqualTo(7);
    }
}
