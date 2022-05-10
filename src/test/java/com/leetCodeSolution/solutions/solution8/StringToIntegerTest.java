package com.leetCodeSolution.solutions.solution8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringToIntegerTest {

    @Test
    void positiveTest() {

        //given:
        String source = "    3165 is string";

        //when:
        int result = StringToInteger.stringToInteger(source);

        //then:
        assert result == 3165;
    }

    @Test
    void negativeTest() {

        //given:
        String source = "    -3165 is string";

        //when:
        int result = StringToInteger.stringToInteger(source);

        //then:
        assert result == -3165;
    }

}
