package com.leetCodeSolution.solutions100to150.solution121;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BestBuySellStockTest {
    @Test
    void 성공() {
        //given:
        int[] prices = {868,352,162,478,215,589,252,231,634};
        //when:
        int maxProfit = BestBuySellStock.maxProfit(prices);
        //then:
        assertThat(maxProfit)
                .isEqualTo(634-162);
    }

    @Test
    void mustReturnZero() {
        //given:
        int[] prices = {7,6,5,4,3,2,1};
        //when:
        int maxProfit = BestBuySellStock.maxProfit(prices);
        //then:
        assertThat(maxProfit)
                .isEqualTo(0);
    }

    @Test
    void mustReturnZero_2() {
        //given:
        int[] prices = {1};
        //when:
        int maxProfit = BestBuySellStock.maxProfit(prices);
        //then:
        assertThat(maxProfit)
                .isEqualTo(0);
    }
}
