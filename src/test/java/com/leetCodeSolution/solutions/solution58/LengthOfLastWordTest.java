package com.leetCodeSolution.solutions.solution58;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthOfLastWordTest {

    @DisplayName("Length of Last Word - 성공")
    @Test
    public void 성공() {
        //given:
        String s = "hi my name is lllllllll this is answer";
        //when:
        int result = LengthOfLastWord.lengthOfLastWord(s);
        //then:
        assertThat(result)
                .isEqualTo(6); //"answer"
    }
}
