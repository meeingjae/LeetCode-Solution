package com.zigzagConversion.solution;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        // punishment , 3
        // 10글자
        // result = "PAYPALISHIRING" , 3
        // [P, ,A, ,H, ,N] --> string s1
        // [A,P,L,S,I,I,G] --> string s2
        // [Y, ,I, ,R, ] --> string s3
        // List<String> sl = new String(s1,s2,s3)<>;
        // string result = s1.foreach(s -> result+=s);

        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) {
            ret.append(row);
        }
        return ret.toString();
    }
}
