package com.reverseInteger;

import com.reverseInteger.solution.ReverseInteger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void reverseTest() {

        //given:
        int num = 123467;

        //when:
        int result = ReverseInteger.reverse(num);

        //then:
        assert result == 764321;
    }

    @Test
    void reverseNegativesTest() {

        //given:
        int num = -123450;

        //when:
        int result = ReverseInteger.reverse(num);

        //then:
        assert result == -54321;
    }

    @Test
    void overFlowTest() {

        //given:
        int num = 1234567899;

        //when:
        int result = ReverseInteger.reverse(num);

        //then:
        assert result == 0; //overflow
    }

}
