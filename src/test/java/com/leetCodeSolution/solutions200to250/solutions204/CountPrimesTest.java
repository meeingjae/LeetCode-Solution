package com.leetCodeSolution.solutions200to250.solutions204;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CountPrimesTest {
    @Test
    void 성공() {
        //given:
        int num = 10;
        //when:
        int result = CountPrimes.countPrimes(num);
        //then:
        assertThat(result).isEqualTo(4);    // 2,3,5,7
    }

    @Test
    void 성공_2() {
        //given:
        int num = 18;
        //when:
        int result = CountPrimes.countPrimes(num);
        //then:
        assertThat(result).isEqualTo(7);    // 2,3,5,7,11,13,17
    }
}
