package com.leetCodeSolution.solutions.solution20;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void 정상() {
        //given:
        String input = "{()}";
        Solution solution = new Solution();
        //when:
        boolean result = solution.isValid(input);
        //then:
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void 실패() {
        //given:
        String input = "{(()}";
        Solution solution = new Solution();
        //when:
        boolean result = solution.isValid(input);
        //then:
        Assertions.assertThat(result).isFalse();
    }
}
