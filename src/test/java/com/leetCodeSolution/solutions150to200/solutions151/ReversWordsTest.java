package com.leetCodeSolution.solutions150to200.solutions151;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ReversWordsTest {

    @Test
    void 성공() {
        //given:
        String source = "happy     birth day haha  ";
        //when:
        String result = ReversWords.reverseWords(source);
        //then:
        assertThat(result)
                .isEqualTo("haha day birth happy");
    }
}
