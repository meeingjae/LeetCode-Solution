package com.leetCodeSolution.solutions200to250.solutions201;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BitwiseAndNumRangeTest {

    @Test
    void 성공() {
        //given:
        int left = 5, right = 7;
        //when:
        int result = BitwiseAndNumRange.rangeBitwiseAnd(left,right);
        //then:
        assertThat(result).isEqualTo(4);
    }

    @Test
    void zeroTest() {
        //given:
        int left = 0, right = 0;
        //when:
        int result = BitwiseAndNumRange.rangeBitwiseAnd(left,right);
        //then:
        assertThat(result).isEqualTo(0);
    }

    @Test
    void maxTest() {
        //given:
        int left = 1, right = 2147483647;
        //when:
        int result = BitwiseAndNumRange.rangeBitwiseAnd(left,right);
        //then:
        assertThat(result).isEqualTo(0);
    }
}
