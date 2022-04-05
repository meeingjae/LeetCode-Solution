package com.longestPalindromicSubstring;

import com.longestPalindromicSubstring.solution.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

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
