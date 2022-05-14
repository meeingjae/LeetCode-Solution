package com.leetCodeSolution.solutions.solution67;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddBinaryTest {

    @DisplayName("Add Binary - 성공")
    @Test
    void 성공() {
        //given:
        String source = "101";
        String target = "11001";
        //when:
        String result = AddBinary.addBinary(source,target);
        //then:
        assertThat(result)
                .isEqualTo("11110");
    }
}
