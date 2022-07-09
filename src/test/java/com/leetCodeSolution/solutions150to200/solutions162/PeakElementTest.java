package com.leetCodeSolution.solutions150to200.solutions162;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PeakElementTest {
    @Test
    void 성공() {
        //given:
        int[] nums = {1,2,3,1};
        //when:
        int result = PeakElement.findPeakElement(nums);
        //then:
        assertThat(result)
                .isEqualTo(2);
    }
}
