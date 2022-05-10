package com.leetCodeSolution.solutions.solution28;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImplementStrStrTest {

    @Test
    void 성공() {
        //given:
        StrStr str = new StrStr("alall","ll");
        //when:
        int index = str.getIndex();
        //then:
        assertThat(index)
                .isEqualTo(3);
    }
}
