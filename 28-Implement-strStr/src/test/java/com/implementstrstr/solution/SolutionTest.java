package com.implementstrstr.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

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
