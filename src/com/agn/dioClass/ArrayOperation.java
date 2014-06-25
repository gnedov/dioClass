package com.agn.dioClass;

import java.util.Arrays;

public class ArrayOperation implements IArrayUnion {

    public ArrayOperation() {
    }

    public int[] leftUnion(int[] leftArray, int[] rightArray) {
        int[] resArr;
        // copy whole left array to the result array
        if (leftArray != null && rightArray != null) {
            resArr = new int[leftArray.length + rightArray.length];
            int index = 0;
            for (int j : leftArray) {
                resArr[index] = j;
                index++;
            }
            // add items from right array to the result under certain conditions
            int tailIndex = leftArray.length;
            for (int i : rightArray) {
                for (int j : resArr) {
                    if (j == i) {
                        resArr[tailIndex] = i;
                        tailIndex++;
                        break;
                    }
                }
            }
            return resArr;
        }
        else
            return null;
    }

    public int[] initLeftArray() {
        int[] resArr = new int[]{1, 5, 4, 23, 65, 32, 78};
        return resArr;
    }

    public int[] initRightArray() {
        int[] resArr = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        return resArr;
    }

    public int[] rightTrimArr(int[] inpArr) {
        if (inpArr != null) {
            int i = 0;
            for (i = inpArr.length - 1; i >= 0; i--) {
                if (inpArr[i] != 0)
                    break;
            }
            return Arrays.copyOf(inpArr, i + 1);
        } else
            return null;
    }
}
