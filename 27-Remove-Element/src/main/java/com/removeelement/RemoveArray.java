package com.removeelement;

public class RemoveArray {

    private final int[] intArray;
    private final int removal;

    public RemoveArray(int[] intArray, int removal) {
        this.intArray = intArray;
        this.removal = removal;
    }

    public int remove() {
        int index = 0;
        for(int i = 0; i<intArray.length; i++) {
            if (intArray[i] != removal) {
                intArray[index] = intArray[i];
                index++;
            }
        }
        return index;
    }
}
