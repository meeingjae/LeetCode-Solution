package com.leetCodeSolution.dp.solution122;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIITest {

    @Test
    void test1() {
        //given:
        final int[] prices = { 7, 1, 5, 3, 6, 4 };
        final int expected = 7;
        //when:
        final int result = BestTimeToBuyAndSellStockII.maxProfit(prices);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int[] prices = { 1, 2, 3, 4, 5 };
        final int expected = 4;
        //when:
        final int result = BestTimeToBuyAndSellStockII.maxProfit(prices);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final int[] prices = { 6, 5, 4, 3, 1 };
        final int expected = 0;
        //when:
        final int result = BestTimeToBuyAndSellStockII.maxProfit(prices);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
