package com.longestsubstringwithoutrepeatingcharacters;

import com.longestsubstringwithoutrepeatingcharacters.solution.LengthOfLongestSubString;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {

        LengthOfLongestSubString test = new LengthOfLongestSubString();
        int i = test.lengthOfLongestSubstring("dvdf");
        System.out.println(i);
    }
}
