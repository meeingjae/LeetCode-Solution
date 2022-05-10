package com.leetCodeSolution.solutions.solution13;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LomanToIntegerTest {

    @Test
    void testSuccess() {
        Integer result = LomanToInteger.romanToInteger("III");
        assert result == 3;
    }

    @Test
    void testSuccess2() {
        Integer result = LomanToInteger.romanToInteger("LVIII");
        assert result == 58;
    }

    @Test
    void testSuccess3() {
        Integer result = LomanToInteger.romanToInteger("MCMXCIV");
        assert result == 1994;
    }

}
