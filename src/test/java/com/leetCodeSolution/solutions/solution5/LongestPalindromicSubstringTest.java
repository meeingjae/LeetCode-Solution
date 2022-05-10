package com.leetCodeSolution.solutions.solution5;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LongestPalindromicSubstringTest {

    @Test
    void contextLoads() {

        //given:
        String source = "enacbnbcaqeinvaeoacbnbcafv";

        //when:
        String result = LongestPalindromicSubstring.longestPalindrome(source);

        //then:
        assert result.equals("acbnbca");
    }

}
