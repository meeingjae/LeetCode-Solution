package com.leetCodeSolution.solutions.solution27;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveElementTest {

    @Test
    void 성공() {
        //given:
        int[] intArray = { 3, 2, 3, 1 };
        int removal = 3;
        RemoveArray removeArray = new RemoveArray(intArray, removal);
        //when:
        int result = removeArray.remove();
        //then:
        assertThat(result)
                .isEqualTo(2);
    }
}
