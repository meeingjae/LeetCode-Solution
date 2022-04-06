package com.zigzagConversion;

import com.zigzagConversion.solution.ZigzagConversion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void converTest() {

        //given:
        String source = "PAYPALISHIRING";

        //when:
        String result = ZigzagConversion.convert(source, 3);

        //then:
        assert result.equals("PAHNAPLSIIGYIR");
    }

}
