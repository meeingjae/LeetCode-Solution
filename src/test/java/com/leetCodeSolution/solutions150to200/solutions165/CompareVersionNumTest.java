package com.leetCodeSolution.solutions150to200.solutions165;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CompareVersionNumTest {

    @Test
    void 성공() {
        //given:
        String version1 = "0.1.1";
        String version2 = "1.1.0";
        //when:
        int result = CompareVersionNum.compareVersion(version1,version2);
        //then:
        assertThat(result).isEqualTo(-1);
    }
}
