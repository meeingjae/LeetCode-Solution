package com.leetCodeSolution.solutions.solution66;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusOneTest {

    @DisplayName("Plus One - 성공")
    @Test
    public void 성공() {
        //given:
        int[] digits = { 9,9 };
        //when:
        int[] result = PlusOne.plustOne(digits);
        //then:
        assertThat(result)
                .containsExactly(1, 0, 0);
    }
}
