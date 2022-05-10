package com.leetCodeSolution.solutions.solution28;

public class StrStr {

    private static final int NOT_CONTAINS = -1;

    private final String hayStack;
    private final String needle;

    public StrStr(String hayStack, String needle) {

        this.hayStack = hayStack;
        this.needle = needle;
    }

    public int getIndex() {

        if (notContains()) {
            return NOT_CONTAINS;
        }
        return hayStack.indexOf(needle);
    }

    private boolean notContains() {

        return !hayStack.contains(needle);
    }
}
