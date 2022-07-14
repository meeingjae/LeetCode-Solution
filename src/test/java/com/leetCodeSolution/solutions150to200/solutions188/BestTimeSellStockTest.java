package com.leetCodeSolution.solutions150to200.solutions188;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BestTimeSellStockTest {
    @Test
    void 성공() {
        //given:
        int k = 2;
        int[] arr = {2, 1, 2, 0, 1, 2};
        //when:
        int result = BestTimeSellStock.maxProfit(k, arr);
        //then:
        assertThat(result).isEqualTo(3);
    }
}
