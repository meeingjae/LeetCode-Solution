package com.leetCodeSolution.dp.solution22;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenerateParenthesesTest {

    @Test
    void test1() {
        //given:
        final int n = 3;
        final List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        //when:
        final List<String> result = GenerateParentheses.generateParenthesis(n);
        //then:
        assertThat(result).containsAll(expected);
    }

    @Test
    void test2() {
        //given:
        final int n = 1;
        final List<String> expected = Collections.singletonList("()");
        //when:
        final List<String> result = GenerateParentheses.generateParenthesis(n);
        //then:
        assertThat(result).containsAll(expected);
    }
}
