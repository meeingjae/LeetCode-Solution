package com.leetCodeSolution.solutions.solution3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LengthOfLongestSubStringTest {

    @Test
    void contextLoads() {

        LengthOfLongestSubString test = new LengthOfLongestSubString();
        int i = test.lengthOfLongestSubstring("dvdf");
        System.out.println(i);
    }
}
