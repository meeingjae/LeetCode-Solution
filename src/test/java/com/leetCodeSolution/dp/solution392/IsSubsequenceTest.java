package com.leetCodeSolution.dp.solution392;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    @Test
    void test1() {
        //given:
        final String s = "abc";
        final String t = "ahbgdc";
        final boolean expected = true;
        //when:
        final boolean result = IsSubsequence.isSubsequence(s, t);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final String s = "axc";
        final String t = "ahbgdc";
        final boolean expected = false;
        //when:
        final boolean result = IsSubsequence.isSubsequence(s, t);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
