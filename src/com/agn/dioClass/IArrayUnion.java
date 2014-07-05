package com.agn.dioClass;

public interface IArrayUnion {

    int[] leftUnion(int[] leftArray, int[] rightArray);

    int[] distinctUnion(int[] leftArray, int[] rightArray);

    int[] innerUnion(int[] leftArray, int[] rightArray);

    int[] outerUnion(int[] leftArray, int[] rightArray);
}
