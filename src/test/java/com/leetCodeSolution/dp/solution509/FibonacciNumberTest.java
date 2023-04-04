package com.leetCodeSolution.dp.solution509;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciNumberTest {

    @ParameterizedTest
    @CsvSource(value = { "2,1", "3,2", "4,3" }, delimiter = ',')
    public void test(int n, int expected) {
        final int result = FibonacciNumber.fib(n);
        assertThat(result).isEqualTo(expected);
    }

}
