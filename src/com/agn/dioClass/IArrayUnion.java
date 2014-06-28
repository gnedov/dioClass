package com.agn.dioClass;

public interface IArrayUnion {
    public int[] leftUnion(int[] leftArray, int[] rightArray);
    
    public int[] distinctUnion(int[] leftArray, int[] rightArray);
    public int[] innerUnion(int[] leftArray, int[] rightArray);
    public int[] outerUnion(int[] leftArray, int[] rightArray);
}
