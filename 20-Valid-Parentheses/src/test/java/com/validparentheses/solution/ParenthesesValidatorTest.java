package com.validparentheses.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParenthesesValidatorTest {

    @Test
    public void 소괄호_테스트() {

        String input = "()";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isTrue();
    }

    @Test
    public void 중괄호_테스트() {

        String input = "{}";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isTrue();
    }

    @Test
    public void 대괄호_테스트() {

        String input = "[]";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isTrue();
    }

    @Test
    public void 소괄호_대괄호_테스트() {

        String input = "()[]";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isTrue();
    }

    @Test
    public void 열2_닫1_테스트() {

        String input = "(()";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isFalse();
    }

    @Test
    public void 열열닫닫_테스트() {

        String input = "(())";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isTrue();
    }

    @Test
    public void 괄호가_아닌_것_테스트() {

        String input = "asdb()";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isFalse();
    }

    @Test
    public void 겹겹이_테스트() {

        String input = "{[]}";
        ParenthesesValidator validator = new ParenthesesValidator(input);
        boolean isValid = validator.isValid();

        assertThat(isValid)
                .isTrue();
    }

}
