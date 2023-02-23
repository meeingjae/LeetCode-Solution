package com.leetCodeSolution.dp.solution121;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    void test1() {
        //given:
        final int[] prices = { 7, 3, 5, 3, 9, 4, 10 };
        final int expected = 7;
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

    @Test
    void test3() {
        //given:
        final int[] prices = { 2, 4, 1 };
        final int expected = 2;
        //when:
        final int result = BestTimeToBuyAndSellStock.maxProfit(prices);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
