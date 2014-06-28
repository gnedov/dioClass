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
                for (int j : leftArray) {
                    if (j == i) {
                        resArr[tailIndex] = i;
                        tailIndex++;
                    }
                }
            }
            return resArr;
        }
        else
            return null;
    }

    public int[] distinctUnion(int[] leftArray, int[] rightArray){
        int[] resArr;
        // copy whole left array to the result array
        if (leftArray != null && rightArray != null) {
            resArr = new int[leftArray.length + rightArray.length];
            System.arraycopy(leftArray, 0, resArr, 0, leftArray.length);

            int tailIndex = leftArray.length;
            Arrays.sort(leftArray);
            for (int i : rightArray){
                if (Arrays.binarySearch(leftArray, i) >= 0)
                    continue;
                else{
                    resArr[tailIndex] = i;
                    tailIndex++;
                }
            }
            return rightTrimArr(resArr);
        }
        else
            return null;
    }
    public int[] innerUnion(int[] leftArray, int[] rightArray){
        int[] resArr = null;

        return resArr;
    }
    public int[] outerUnion(int[] leftArray, int[] rightArray){
        int[] resArr = null;

        return resArr;
    }

    public int[] initLeftArray() {
        return initLeftArray(EnumOperationType.LEFT_UNION);
    }
    
    public int[] initLeftArray(EnumOperationType eopTypeName){
        int[] resArr;
        switch (eopTypeName){
            case LEFT_UNION:
                resArr = new int[]{1, 5, 4, 23, 65, 32, 78}; break;
            case RIGHT_UNION:
                resArr = new int[]{}; break;
            case INNER_UNION:
                resArr = new int[]{}; break;
            case OUTER_UNION:
                resArr = new int[]{}; break;
            case DISTINCT_UNION:
                resArr = new int[]{1,5,4,23,65,32,78}; break;
            default:
                resArr = new int[]{}; break;
        }
        return resArr;
    }

    public int[] initRightArray() {
        return initRightArray(EnumOperationType.LEFT_UNION);
    }

    public int[] initRightArray(EnumOperationType eopTypeName){
        int[] resArr;
        switch (eopTypeName){
            case LEFT_UNION:
                resArr = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5}; break;
            case RIGHT_UNION:
                resArr = new int[]{}; break;
            case INNER_UNION:
                resArr = new int[]{}; break;
            case OUTER_UNION:
                resArr = new int[]{}; break;
            case DISTINCT_UNION:
                resArr = new int[]{3,5,24,54,1,2,34,45,32}; break;
            default:
                resArr = new int[]{}; break;
        }
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
