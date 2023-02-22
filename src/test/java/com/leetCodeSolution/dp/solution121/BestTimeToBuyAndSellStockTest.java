package com.leetCodeSolution.dp.solution121;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    void test1() {
        //given:
        final int[] prices = { 7, 1, 5, 3, 6, 4 };
        final int expected = 5;
        //when:
        final int result = BestTimeToBuyAndSellStock.maxProfit(prices);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int[] prices = { 7, 6, 4, 3, 1 };
        final int expected = 0;
        //when:
        final int result = BestTimeToBuyAndSellStock.maxProfit(prices);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
