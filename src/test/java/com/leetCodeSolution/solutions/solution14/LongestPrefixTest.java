package com.leetCodeSolution.solutions.solution14;

import org.junit.jupiter.api.Test;

class LongestPrefixTest {

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
