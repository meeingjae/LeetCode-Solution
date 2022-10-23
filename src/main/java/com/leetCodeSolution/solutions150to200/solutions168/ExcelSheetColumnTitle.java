package com.leetCodeSolution.solutions150to200.solutions168;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        return columnNumber == 0 ?
               "" :
               convertToTitle(--columnNumber / 26) + (char) ('A' + (columnNumber % 26));
    }
}
