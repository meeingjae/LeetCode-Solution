package com.leetCodeSolution.solutions100to150.solution125;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IsPalindromeTest {

    @Test
    void 성공() {
        //given:
        String palindrome = "hi my name is ming..gnim si eman ym ih..";
        //when:
        boolean result = IsPalindrome.isPalindrome(palindrome);
        //then:
        assertThat(result)
                .isTrue();
    }
}
