package com.leetCodeSolution.solutions.solution17;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LetterCombinationsPhoneNumberTest {

    @Test
    void name() {
        String input = "23";
        List<String> result = LetterCombinationsPhoneNumber.letterCombinations(input);
        assertThat(result).containsSequence(
                Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        );
    }

    @Test
    void success() {
        String input = "239";
        List<String> result = LetterCombinationsPhoneNumber.letterCombinations(input);
        assertThat(result).containsSequence(
                Arrays.asList(
                        "adw",
                        "adx",
                        "ady",
                        "adz",
                        "aew",
                        "aex",
                        "aey",
                        "aez",
                        "afw",
                        "afx",
                        "afy",
                        "afz",
                        "bdw",
                        "bdx",
                        "bdy",
                        "bdz",
                        "bew",
                        "bex",
                        "bey",
                        "bez",
                        "bfw",
                        "bfx",
                        "bfy",
                        "bfz",
                        "cdw",
                        "cdx",
                        "cdy",
                        "cdz",
                        "cew",
                        "cex",
                        "cey",
                        "cez",
                        "cfw",
                        "cfx",
                        "cfy",
                        "cfz")
        );
    }
}
