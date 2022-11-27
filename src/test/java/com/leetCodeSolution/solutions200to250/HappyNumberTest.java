package com.leetCodeSolution.solutions200to250;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    @Test
    void success() {
        int source = 19;
        boolean result = HappyNumber.isHappyNumber(source);
        assertThat(result).isTrue();
    }
}
