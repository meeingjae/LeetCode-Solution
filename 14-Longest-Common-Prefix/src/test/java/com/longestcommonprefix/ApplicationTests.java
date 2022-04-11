package com.longestcommonprefix;

import com.longestcommonprefix.solution.LongestPrefix;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void test() {

        //given:
        String[] source = new String[3];

        source[0] = "firefox";
        source[1] = "firix";
        source[2] = "firuration";

        //when:
        String result = LongestPrefix.longestPrefix(source);

        //then:
        assert result.equals("fir");
    }

}
