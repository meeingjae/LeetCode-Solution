package com.stringToInteger;

import com.stringToInteger.solution.StringToInteger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

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
