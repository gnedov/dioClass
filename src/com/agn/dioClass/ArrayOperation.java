package com.agn.dioClass;

import java.util.Arrays;

public class ArrayOperation implements IArrayUnion {

    public ArrayOperation() {
    }

    public int[] leftUnion(int[] leftArray, int[] rightArray) {
        int[] resArr;

        if (leftArray != null && rightArray != null) {
            // copy whole left array to the result array
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

        if (leftArray != null && rightArray != null) {
            // copy whole left array to the result array
            resArr = new int[leftArray.length + rightArray.length];
            System.arraycopy(leftArray, 0, resArr, 0, leftArray.length);

            int tailIndex = leftArray.length;
            Arrays.sort(leftArray);
            for (int i : rightArray){
                if (Arrays.binarySearch(leftArray, i) >= 0) {
                }
                else{
                    resArr[tailIndex] = i;
                    tailIndex++;
                }
            }
            return  Arrays.copyOf(resArr, tailIndex);
        }
        else
            return null;
    }

    public int[] innerUnion(int[] leftArray, int[] rightArray){
        int[] resArr;
        if (leftArray != null && rightArray != null) {
            resArr = new int[Math.min(leftArray.length, rightArray.length)];
            int j = 0;
            Arrays.sort(rightArray);
            for (int i : leftArray) {
                if (Arrays.binarySearch(rightArray, i) >= 0) {
                    resArr[j] = i;
                    j++;
                }
            }
            return Arrays.copyOf(resArr, j);
        } else
            return null;
    }

    public int[] outerUnion(int[] leftArray, int[] rightArray){
        int[] resArr;

        if (leftArray != null && rightArray != null) {
            int[] arrDiff1 = findDiffItems(leftArray, rightArray);
            int[] arrDiff2 = findDiffItems(rightArray, leftArray);
            resArr = new int[arrDiff1.length + arrDiff2.length];
            System.arraycopy(arrDiff1, 0, resArr, 0, arrDiff1.length);
            System.arraycopy(arrDiff2, 0, resArr, arrDiff1.length, arrDiff2.length);

            return resArr;
        }
        else
            return null;
    }

    private int[] findDiffItems(int[] arrMaster, int[] arrSlave) {
        int[] resDiff;
        resDiff = new int[arrMaster.length];
        arrMaster = Arrays.copyOf(arrMaster, arrMaster.length);
        arrSlave = Arrays.copyOf(arrSlave, arrSlave.length);
        int j = 0;
        Arrays.sort(arrSlave);
        for (int i : arrMaster) {
            if (Arrays.binarySearch(arrSlave, i) >= 0) {
            }
            else {
                resDiff[j] = i;
                j++;
            }
        }
        return Arrays.copyOf(resDiff, j);
    }
    
    public int[] rightTrimArr(int[] inpArr) {
        if (inpArr != null) {
            int i;
            for (i = inpArr.length - 1; i >= 0; i--) {
                if (inpArr[i] != 0)
                    break;
            }
            return Arrays.copyOf(inpArr, i + 1);
        } else
            return null;
    }

    public void printOutInCol(int[] arrPrint){
        if (arrPrint != null) {
            int k = 0;
            for (int i : arrPrint) {
                System.out.println("Index [" + k + "]: " + i);
                ++k;
            }
        }
    }
    
    public void printOutInRow(int[] arrPrint){
        if (arrPrint != null) {
            System.out.print(Arrays.toString(arrPrint));
        }
    }
}
